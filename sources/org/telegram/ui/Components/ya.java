package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ya(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                gc gcVar = (gc) this.b;
                if (gcVar.d == gVar) {
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
                zk zkVar = (zk) this.b;
                zkVar.m0 = null;
                zkVar.n0 = 1.0f;
                zkVar.m0();
                break;
            case 3:
                qn0 qn0Var = (qn0) this.b;
                qn0Var.q = false;
                qn0Var.dismiss();
                break;
            case 4:
                rn0 rn0Var = (rn0) this.b;
                rn0Var.s = false;
                rn0Var.r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == rn0Var.f) {
                    rn0Var.f = null;
                    break;
                }
                break;
            case 5:
                ap0 ap0Var = (ap0) this.b;
                ap0Var.A1.setVisibility(8);
                ap0Var.v2.setVisibility(8);
                yo0 yo0Var = ap0Var.H1;
                yo0Var.f = null;
                yo0Var.f();
                ap0Var.x2 = null;
                ap0Var.I2 = false;
                break;
            default:
                ap0 ap0Var2 = ((jo0) this.b).d;
                ap0Var2.B1.setVisibility(8);
                ap0Var2.C1.setVisibility(8);
                ap0Var2.u2.setVisibility(8);
                ap0Var2.x2 = null;
                break;
        }
    }
}
