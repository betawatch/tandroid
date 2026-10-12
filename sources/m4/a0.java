package m4;

import m.d3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements e0, p0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(q0 q0Var, b2.p0 p0Var, boolean z10, boolean z11) {
        this.c = q0Var;
        this.d = p0Var;
        this.a = z10;
        this.b = z11;
    }

    @Override // m4.e0
    public void d(v vVar, int i10) {
        vVar.f(i10, (s1) this.c, this.a, this.b, ((w) this.d).c);
    }

    @Override // m4.p0
    public void f(w wVar) {
        q0 q0Var = (q0) this.c;
        j9.e0 q6 = q0Var.g.q(wVar, e9.n0.y((b2.p0) this.d), -1, -9223372036854775807L);
        d3 d3Var = new d3();
        d3Var.d = q0Var;
        d3Var.c = wVar;
        d3Var.a = this.a;
        d3Var.b = this.b;
        q6.a(new j9.u(0, q6, d3Var), j9.r.a);
    }

    public /* synthetic */ a0(s1 s1Var, boolean z10, boolean z11, w wVar) {
        this.c = s1Var;
        this.a = z10;
        this.b = z11;
        this.d = wVar;
    }
}
