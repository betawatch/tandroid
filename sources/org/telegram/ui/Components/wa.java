package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.b;
                if (ecVar.d == hVar) {
                    ecVar.d = null;
                    break;
                }
                break;
            case 1:
                sa saVar = (sa) this.b;
                if (!z10) {
                    saVar.run();
                    break;
                }
                break;
            case 2:
                fo0 fo0Var = (fo0) this.b;
                fo0Var.q = false;
                fo0Var.dismiss();
                break;
            case 3:
                go0 go0Var = (go0) this.b;
                go0Var.s = false;
                go0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == go0Var.f) {
                    go0Var.f = null;
                    break;
                }
                break;
            case 4:
                sp0 sp0Var = (sp0) this.b;
                sp0Var.A.setVisibility(8);
                sp0Var.v0.setVisibility(8);
                pp0 pp0Var = sp0Var.H;
                pp0Var.f = null;
                pp0Var.l();
                sp0Var.x0 = null;
                sp0Var.I0 = false;
                break;
            default:
                sp0 sp0Var2 = ((yo0) this.b).d;
                sp0Var2.B.setVisibility(8);
                sp0Var2.C.setVisibility(8);
                sp0Var2.u0.setVisibility(8);
                sp0Var2.x0 = null;
                break;
        }
    }
}
