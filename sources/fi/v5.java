package fi;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v5 implements rg.b1 {
    public final /* synthetic */ ta a;

    public v5(ta taVar) {
        this.a = taVar;
    }

    @Override // rg.b1
    public final void b() {
        w5 w5Var = this.a.E0;
        if (w5Var != null) {
            w5Var.invalidate();
        }
    }

    @Override // rg.b1
    public final void c() {
        ta taVar = this.a;
        if (taVar.R0) {
            taVar.R0 = false;
        } else {
            taVar.Z0.b(1);
            taVar.i((rg.m) rg.m.a.get(0));
        }
    }

    @Override // rg.b1
    public final boolean d() {
        ta taVar = this.a;
        boolean z10 = taVar.y0 == null;
        if (!z10) {
            taVar.A0(null, true);
        }
        return z10;
    }

    @Override // rg.b1
    public final void e() {
        ta taVar = this.a;
        taVar.s0.a.a();
        taVar.S0.setViewHidden(false);
    }

    @Override // rg.b1
    public final void f() {
        ta taVar = this.a;
        if (taVar.y0 != null) {
            taVar.A0(null, true);
        }
        taVar.S0.setViewHidden(true);
    }

    @Override // rg.b1
    public final void a() {
    }
}
