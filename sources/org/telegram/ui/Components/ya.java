package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                zo0 zo0Var = (zo0) this.b;
                zo0Var.q = false;
                zo0Var.dismiss();
                break;
            case 3:
                ap0 ap0Var = (ap0) this.b;
                ap0Var.s = false;
                ap0Var.r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == ap0Var.f) {
                    ap0Var.f = null;
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
                lq0 lq0Var2 = ((sp0) this.b).d;
                lq0Var2.C.setVisibility(8);
                lq0Var2.D.setVisibility(8);
                lq0Var2.v0.setVisibility(8);
                lq0Var2.y0 = null;
                break;
        }
    }
}
