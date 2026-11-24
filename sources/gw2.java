// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class gw2 extends of0 {
    private final sw2 _context;
    private transient fw2 intercepted;

    public gw2(fw2 fw2Var) {
        this(fw2Var, fw2Var != null ? fw2Var.getContext() : null);
    }

    @Override // fw2
    public sw2 getContext() {
        sw2 sw2Var = this._context;
        sw2Var.getClass();
        return sw2Var;
    }

    public final fw2 intercepted() {
        fw2 fw2Var = this.intercepted;
        if (fw2Var != null) {
            return fw2Var;
        }
        vw2 vw2Var = (vw2) getContext().get(vi2.b);
        fw2 ho3Var = vw2Var != null ? new ho3(vw2Var, this) : this;
        this.intercepted = ho3Var;
        return ho3Var;
    }

    @Override // of0
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        fw2 fw2Var = this.intercepted;
        if (fw2Var != null && fw2Var != this) {
            qw2 qw2Var = getContext().get(vi2.b);
            qw2Var.getClass();
            ho3 ho3Var = (ho3) fw2Var;
            do {
                unsafe = ex.a;
                j = ho3.n;
            } while (unsafe.getObjectVolatile(ho3Var, j) == r3c.b);
            Object objectVolatile = unsafe.getObjectVolatile(ho3Var, j);
            na1 na1Var = objectVolatile instanceof na1 ? (na1) objectVolatile : null;
            if (na1Var != null) {
                na1Var.n();
            }
        }
        this.intercepted = ep2.b;
    }

    public gw2(fw2 fw2Var, sw2 sw2Var) {
        super(fw2Var);
        this._context = sw2Var;
    }
}
