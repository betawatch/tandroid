// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
