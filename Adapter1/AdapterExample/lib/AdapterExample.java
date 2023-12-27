// Old system with an incompatible interface
class OldSystem {
    void doSomethingOld() {
        System.out.println("Old system is doing something.");
    }
}

// New system with a compatible interface
interface NewSystem {
    void doSomethingNew();
}

// Adapter class that makes the OldSystem compatible with the NewSystem
class OldSystemAdapter implements NewSystem {
    private OldSystem oldSystem;

    public OldSystemAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void doSomethingNew() {
        oldSystem.doSomethingOld();
    }
}

public class AdapterExample {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        NewSystem newSystem = new OldSystemAdapter(oldSystem);

        // Now, you can use the new system interface to call the old system's method
        newSystem.doSomethingNew();
    }
}