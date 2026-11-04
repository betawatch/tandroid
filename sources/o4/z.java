package o4;

import m.b3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements d0, n0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(o0 o0Var, d2.n0 n0Var, boolean z10, boolean z11) {
        this.c = o0Var;
        this.d = n0Var;
        this.a = z10;
        this.b = z11;
    }

    @Override // o4.n0
    public void c(v vVar) {
        o0 o0Var = (o0) this.c;
        l9.e0 q10 = o0Var.h.q(vVar, g9.i0.u((d2.n0) this.d), -1, -9223372036854775807L);
        b3 b3Var = new b3();
        b3Var.d = o0Var;
        b3Var.c = vVar;
        b3Var.a = this.a;
        b3Var.b = this.b;
        q10.b(new l9.u(0, q10, b3Var), l9.r.a);
    }

    @Override // o4.d0
    public void d(u uVar, int i3) {
        uVar.i(i3, (q1) this.c, this.a, this.b, ((v) this.d).c);
    }

    public /* synthetic */ z(q1 q1Var, boolean z10, boolean z11, v vVar) {
        this.c = q1Var;
        this.a = z10;
        this.b = z11;
        this.d = vVar;
    }
}
