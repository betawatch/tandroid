package m4;

import m.d3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements e0, o0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(p0 p0Var, b2.p0 p0Var2, boolean z10, boolean z11) {
        this.c = p0Var;
        this.d = p0Var2;
        this.a = z10;
        this.b = z11;
    }

    @Override // m4.e0
    public void d(v vVar, int i10) {
        vVar.f(i10, (s1) this.c, this.a, this.b, ((w) this.d).c);
    }

    @Override // m4.o0
    public void i(w wVar) {
        p0 p0Var = (p0) this.c;
        k9.e0 q5 = p0Var.g.q(wVar, f9.i0.y((b2.p0) this.d), -1, -9223372036854775807L);
        d3 d3Var = new d3();
        d3Var.d = p0Var;
        d3Var.c = wVar;
        d3Var.a = this.a;
        d3Var.b = this.b;
        q5.a(new k9.u(0, q5, d3Var), k9.r.a);
    }

    public /* synthetic */ a0(s1 s1Var, boolean z10, boolean z11, w wVar) {
        this.c = s1Var;
        this.a = z10;
        this.b = z11;
        this.d = wVar;
    }
}
