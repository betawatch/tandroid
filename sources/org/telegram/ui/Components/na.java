package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                wb wbVar = (wb) this.b;
                if (wbVar.d == jVar) {
                    wbVar.d = null;
                    break;
                }
                break;
            case 1:
                ja jaVar = (ja) this.b;
                if (!z10) {
                    jaVar.run();
                    break;
                }
                break;
            case 2:
                kk kkVar = (kk) this.b;
                kkVar.l0 = null;
                kkVar.m0 = 1.0f;
                kkVar.k0();
                break;
            case 3:
                do0 do0Var = (do0) this.b;
                do0Var.q = false;
                do0Var.dismiss();
                break;
            case 4:
                eo0 eo0Var = (eo0) this.b;
                eo0Var.s = false;
                eo0Var.r = false;
                if (!z10) {
                    jVar.d();
                }
                if (jVar == eo0Var.f) {
                    eo0Var.f = null;
                    break;
                }
                break;
            case 5:
                pp0 pp0Var = (pp0) this.b;
                pp0Var.w1.setVisibility(8);
                pp0Var.r2.setVisibility(8);
                np0 np0Var = pp0Var.D1;
                np0Var.f = null;
                np0Var.f();
                pp0Var.t2 = null;
                pp0Var.E2 = false;
                break;
            default:
                pp0 pp0Var2 = ((yo0) this.b).d;
                pp0Var2.x1.setVisibility(8);
                pp0Var2.y1.setVisibility(8);
                pp0Var2.q2.setVisibility(8);
                pp0Var2.t2 = null;
                break;
        }
    }
}
