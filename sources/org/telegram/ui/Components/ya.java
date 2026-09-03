package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                ic icVar = (ic) this.b;
                if (icVar.d == hVar) {
                    icVar.d = null;
                    break;
                }
                break;
            case 1:
                ua uaVar = (ua) this.b;
                if (!z4) {
                    uaVar.run();
                    break;
                }
                break;
            case 2:
                yo0 yo0Var = (yo0) this.b;
                yo0Var.q = false;
                yo0Var.dismiss();
                break;
            case 3:
                zo0 zo0Var = (zo0) this.b;
                zo0Var.s = false;
                zo0Var.r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == zo0Var.f) {
                    zo0Var.f = null;
                    break;
                }
                break;
            case 4:
                lq0 lq0Var = (lq0) this.b;
                lq0Var.B.setVisibility(8);
                lq0Var.w0.setVisibility(8);
                iq0 iq0Var = lq0Var.I;
                iq0Var.f = null;
                iq0Var.l();
                lq0Var.y0 = null;
                lq0Var.J0 = false;
                break;
            default:
                lq0 lq0Var2 = ((rp0) this.b).d;
                lq0Var2.C.setVisibility(8);
                lq0Var2.D.setVisibility(8);
                lq0Var2.v0.setVisibility(8);
                lq0Var2.y0 = null;
                break;
        }
    }
}
