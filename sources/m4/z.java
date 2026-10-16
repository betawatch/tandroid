package m4;

import m.f3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements d0, o0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(p0 p0Var, b2.p0 p0Var2, boolean z10, boolean z11) {
        this.c = p0Var;
        this.d = p0Var2;
        this.a = z10;
        this.b = z11;
    }

    @Override // m4.d0
    public void d(u uVar, int i10) {
        uVar.f(i10, (r1) this.c, this.a, this.b, ((v) this.d).c);
    }

    @Override // m4.o0
    public void e(v vVar) {
        p0 p0Var = (p0) this.c;
        j9.e0 q6 = p0Var.g.q(vVar, e9.n0.y((b2.p0) this.d), -1, -9223372036854775807L);
        f3 f3Var = new f3();
        f3Var.d = p0Var;
        f3Var.c = vVar;
        f3Var.a = this.a;
        f3Var.b = this.b;
        q6.a(new j9.u(0, q6, f3Var), j9.r.a);
    }

    public /* synthetic */ z(r1 r1Var, boolean z10, boolean z11, v vVar) {
        this.c = r1Var;
        this.a = z10;
        this.b = z11;
        this.d = vVar;
    }
}
