package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                pp0 pp0Var = (pp0) this.b;
                pp0Var.q = false;
                pp0Var.dismiss();
                break;
            case 3:
                qp0 qp0Var = (qp0) this.b;
                qp0Var.s = false;
                qp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == qp0Var.f) {
                    qp0Var.f = null;
                    break;
                }
                break;
            case 4:
                br0 br0Var = (br0) this.b;
                br0Var.E.setVisibility(8);
                br0Var.z0.setVisibility(8);
                yq0 yq0Var = br0Var.L;
                yq0Var.f = null;
                yq0Var.l();
                br0Var.B0 = null;
                br0Var.M0 = false;
                break;
            default:
                br0 br0Var2 = ((iq0) this.b).d;
                br0Var2.F.setVisibility(8);
                br0Var2.G.setVisibility(8);
                br0Var2.y0.setVisibility(8);
                br0Var2.B0 = null;
                break;
        }
    }
}
