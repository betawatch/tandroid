package m4;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class e1 extends b2.k1 {
    public static final Object k = new Object();
    public final b2.k0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final b2.e0 i;
    public final long j;

    public e1(f1 f1Var) {
        this.e = f1Var.w();
        this.f = f1Var.d0();
        this.g = f1Var.t0();
        this.h = !f1Var.w0().p() && f1Var.w0().m(f1Var.l0(), new b2.j1(), 0L).k;
        this.i = f1Var.M0() ? b2.e0.f : null;
        this.j = e2.d0.Q(f1Var.A());
    }

    @Override // b2.k1
    public final int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // b2.k1
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.c;
        Object obj = k;
        h1Var.h(obj, obj, 0, this.j, 0L, bVar, false);
        h1Var.f = this.h;
        return h1Var;
    }

    @Override // b2.k1
    public final int h() {
        return 1;
    }

    @Override // b2.k1
    public final Object l(int i10) {
        return k;
    }

    @Override // b2.k1
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.i, 0L, this.j, 0, 0, 0L);
        j1Var.k = this.h;
        return j1Var;
    }

    @Override // b2.k1
    public final int o() {
        return 1;
    }
}
