package m4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class m1 extends b2.p1 {
    public static final Object j = new Object();
    public final b2.p0 e;
    public final boolean f;
    public final boolean g;
    public final b2.j0 h;
    public final long i;

    public m1(n1 n1Var) {
        this.e = n1Var.v();
        this.f = n1Var.e0();
        this.g = n1Var.v0();
        this.h = n1Var.P0() ? b2.j0.f : null;
        this.i = e2.m0.S(n1Var.z());
    }

    @Override // b2.p1
    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    @Override // b2.p1
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        m1Var.getClass();
        b2.c cVar = b2.c.c;
        Object obj = j;
        m1Var.h(obj, obj, 0, this.i, 0L, cVar, false);
        m1Var.f = false;
        return m1Var;
    }

    @Override // b2.p1
    public final int h() {
        return 1;
    }

    @Override // b2.p1
    public final Object l(int i10) {
        return j;
    }

    @Override // b2.p1
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        o1Var.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        o1Var.k = false;
        return o1Var;
    }

    @Override // b2.p1
    public final int o() {
        return 1;
    }
}
