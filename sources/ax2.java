// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ax2 extends qf0 {
    private final mx2 _context;
    private transient zw2 intercepted;

    public ax2(zw2 zw2Var) {
        this(zw2Var, zw2Var != null ? zw2Var.getContext() : null);
    }

    @Override // zw2
    public mx2 getContext() {
        mx2 mx2Var = this._context;
        mx2Var.getClass();
        return mx2Var;
    }

    public final zw2 intercepted() {
        zw2 zw2Var = this.intercepted;
        if (zw2Var != null) {
            return zw2Var;
        }
        px2 px2Var = (px2) getContext().get(rj2.b);
        zw2 yo3Var = px2Var != null ? new yo3(px2Var, this) : this;
        this.intercepted = yo3Var;
        return yo3Var;
    }

    @Override // qf0
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        zw2 zw2Var = this.intercepted;
        if (zw2Var != null && zw2Var != this) {
            kx2 kx2Var = getContext().get(rj2.b);
            kx2Var.getClass();
            yo3 yo3Var = (yo3) zw2Var;
            do {
                unsafe = fx.a;
                j = yo3.n;
            } while (unsafe.getObjectVolatile(yo3Var, j) == q7c.b);
            Object objectVolatile = unsafe.getObjectVolatile(yo3Var, j);
            va1 va1Var = objectVolatile instanceof va1 ? (va1) objectVolatile : null;
            if (va1Var != null) {
                va1Var.n();
            }
        }
        this.intercepted = xp2.b;
    }

    public ax2(zw2 zw2Var, mx2 mx2Var) {
        super(zw2Var);
        this._context = mx2Var;
    }
}
