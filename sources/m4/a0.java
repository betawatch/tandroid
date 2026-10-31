package m4;

import m.c3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    @Override // m4.o0
    public void b(w wVar) {
        p0 p0Var = (p0) this.c;
        j9.e0 q6 = p0Var.h.q(wVar, e9.n0.y((b2.p0) this.d), -1, -9223372036854775807L);
        c3 c3Var = new c3();
        c3Var.d = p0Var;
        c3Var.c = wVar;
        c3Var.a = this.a;
        c3Var.b = this.b;
        q6.a(new j9.u(0, q6, c3Var), j9.r.a);
    }

    @Override // m4.e0
    public void e(v vVar, int i10) {
        vVar.f(i10, (s1) this.c, this.a, this.b, ((w) this.d).c);
    }

    public /* synthetic */ a0(s1 s1Var, boolean z10, boolean z11, w wVar) {
        this.c = s1Var;
        this.a = z10;
        this.b = z11;
        this.d = wVar;
    }
}
