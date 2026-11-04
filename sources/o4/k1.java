package o4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k1 extends d2.n1 {
    public static final Object j = new Object();
    public final d2.n0 e;
    public final boolean f;
    public final boolean g;
    public final d2.h0 h;
    public final long i;

    public k1(l1 l1Var) {
        this.e = l1Var.w();
        this.f = l1Var.c0();
        this.g = l1Var.s0();
        this.h = l1Var.P0() ? d2.h0.f : null;
        this.i = g2.n0.S(l1Var.A());
    }

    @Override // d2.n1
    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    @Override // d2.n1
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        k1Var.getClass();
        d2.c cVar = d2.c.c;
        Object obj = j;
        k1Var.h(obj, obj, 0, this.i, 0L, cVar, false);
        k1Var.f = false;
        return k1Var;
    }

    @Override // d2.n1
    public final int h() {
        return 1;
    }

    @Override // d2.n1
    public final Object l(int i3) {
        return j;
    }

    @Override // d2.n1
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        m1Var.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        m1Var.k = false;
        return m1Var;
    }

    @Override // d2.n1
    public final int o() {
        return 1;
    }
}
