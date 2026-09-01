package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                ap0 ap0Var = (ap0) this.b;
                ap0Var.q = false;
                ap0Var.dismiss();
                break;
            case 3:
                bp0 bp0Var = (bp0) this.b;
                bp0Var.s = false;
                bp0Var.r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == bp0Var.f) {
                    bp0Var.f = null;
                    break;
                }
                break;
            case 4:
                mq0 mq0Var = (mq0) this.b;
                mq0Var.B.setVisibility(8);
                mq0Var.w0.setVisibility(8);
                jq0 jq0Var = mq0Var.I;
                jq0Var.f = null;
                jq0Var.l();
                mq0Var.y0 = null;
                mq0Var.J0 = false;
                break;
            default:
                mq0 mq0Var2 = ((tp0) this.b).d;
                mq0Var2.C.setVisibility(8);
                mq0Var2.D.setVisibility(8);
                mq0Var2.v0.setVisibility(8);
                mq0Var2.y0 = null;
                break;
        }
    }
}
