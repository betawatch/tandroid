// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ccb extends gw2 implements oq4 {
    private final int arity;

    public ccb(int i, fw2 fw2Var) {
        super(fw2Var);
        this.arity = i;
    }

    @Override // oq4
    public int getArity() {
        return this.arity;
    }

    @Override // of0
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        f59.a.getClass();
        return g59.a(this);
    }
}
