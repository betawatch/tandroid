package i2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k1 extends u2.r {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public k1(b2.k1 k1Var, b2.k0 k0Var) {
        super(k1Var);
        this.g = k0Var;
    }

    @Override // u2.r, b2.k1
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f) {
            case 0:
                b2.k1 k1Var = this.e;
                b2.h1 f7 = k1Var.f(i10, h1Var, z10);
                if (k1Var.m(f7.c, (b2.j1) this.g, 0L).a()) {
                    f7.h(h1Var.a, h1Var.b, h1Var.c, h1Var.d, h1Var.e, b2.b.c, true);
                } else {
                    f7.f = true;
                }
                return f7;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override // u2.r, b2.k1
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f) {
            case 1:
                super.m(i10, j1Var, j3);
                b2.k0 k0Var = (b2.k0) this.g;
                j1Var.c = k0Var;
                b2.f0 f0Var = k0Var.b;
                j1Var.getClass();
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }

    public k1(b2.k1 k1Var) {
        super(k1Var);
        this.g = new b2.j1();
    }
}
