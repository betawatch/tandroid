package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                gc gcVar = (gc) this.b;
                if (gcVar.d == hVar) {
                    gcVar.d = null;
                    break;
                }
                break;
            case 1:
                ua uaVar = (ua) this.b;
                if (!z10) {
                    uaVar.run();
                    break;
                }
                break;
            case 2:
                eo0 eo0Var = (eo0) this.b;
                eo0Var.q = false;
                eo0Var.dismiss();
                break;
            case 3:
                fo0 fo0Var = (fo0) this.b;
                fo0Var.s = false;
                fo0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == fo0Var.f) {
                    fo0Var.f = null;
                    break;
                }
                break;
            case 4:
                rp0 rp0Var = (rp0) this.b;
                rp0Var.A.setVisibility(8);
                rp0Var.v0.setVisibility(8);
                op0 op0Var = rp0Var.H;
                op0Var.f = null;
                op0Var.l();
                rp0Var.x0 = null;
                rp0Var.I0 = false;
                break;
            default:
                rp0 rp0Var2 = ((yo0) this.b).d;
                rp0Var2.B.setVisibility(8);
                rp0Var2.C.setVisibility(8);
                rp0Var2.u0.setVisibility(8);
                rp0Var2.x0 = null;
                break;
        }
    }
}
