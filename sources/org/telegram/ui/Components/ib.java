package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                rc rcVar = (rc) this.b;
                if (rcVar.d == hVar) {
                    rcVar.d = null;
                    break;
                }
                break;
            case 1:
                eb ebVar = (eb) this.b;
                if (!z10) {
                    ebVar.run();
                    break;
                }
                break;
            case 2:
                op0 op0Var = (op0) this.b;
                op0Var.q = false;
                op0Var.dismiss();
                break;
            case 3:
                pp0 pp0Var = (pp0) this.b;
                pp0Var.s = false;
                pp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == pp0Var.f) {
                    pp0Var.f = null;
                    break;
                }
                break;
            case 4:
                zq0 zq0Var = (zq0) this.b;
                zq0Var.E.setVisibility(8);
                zq0Var.z0.setVisibility(8);
                wq0 wq0Var = zq0Var.L;
                wq0Var.f = null;
                wq0Var.l();
                zq0Var.B0 = null;
                zq0Var.M0 = false;
                break;
            default:
                zq0 zq0Var2 = ((gq0) this.b).d;
                zq0Var2.F.setVisibility(8);
                zq0Var2.G.setVisibility(8);
                zq0Var2.y0.setVisibility(8);
                zq0Var2.B0 = null;
                break;
        }
    }
}
