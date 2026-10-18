package m4;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class l1 extends b2.o1 {
    public static final Object j = new Object();
    public final b2.o0 e;
    public final boolean f;
    public final boolean g;
    public final b2.i0 h;
    public final long i;

    public l1(m1 m1Var) {
        this.e = m1Var.v();
        this.f = m1Var.e0();
        this.g = m1Var.v0();
        this.h = m1Var.P0() ? b2.i0.f : null;
        this.i = e2.m0.S(m1Var.z());
    }

    @Override // b2.o1
    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    @Override // b2.o1
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        l1Var.getClass();
        b2.c cVar = b2.c.c;
        Object obj = j;
        l1Var.h(obj, obj, 0, this.i, 0L, cVar, false);
        l1Var.f = false;
        return l1Var;
    }

    @Override // b2.o1
    public final int h() {
        return 1;
    }

    @Override // b2.o1
    public final Object l(int i10) {
        return j;
    }

    @Override // b2.o1
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        n1Var.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        n1Var.k = false;
        return n1Var;
    }

    @Override // b2.o1
    public final int o() {
        return 1;
    }
}
