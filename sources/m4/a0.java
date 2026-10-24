package m4;

import m.e3;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements e0, o0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(p0 p0Var, b2.o0 o0Var, boolean z10, boolean z11) {
        this.c = p0Var;
        this.d = o0Var;
        this.a = z10;
        this.b = z11;
    }

    @Override // m4.e0
    public void e(u uVar, int i10) {
        uVar.f(i10, (r1) this.c, this.a, this.b, ((v) this.d).c);
    }

    @Override // m4.o0
    public void f(v vVar) {
        p0 p0Var = (p0) this.c;
        j9.e0 q6 = p0Var.g.q(vVar, e9.n0.y((b2.o0) this.d), -1, -9223372036854775807L);
        e3 e3Var = new e3();
        e3Var.d = p0Var;
        e3Var.c = vVar;
        e3Var.a = this.a;
        e3Var.b = this.b;
        q6.a(new j9.u(0, q6, e3Var), j9.r.a);
    }

    public /* synthetic */ a0(r1 r1Var, boolean z10, boolean z11, v vVar) {
        this.c = r1Var;
        this.a = z10;
        this.b = z11;
        this.d = vVar;
    }
}
