package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                xk xkVar = (xk) this.b;
                xkVar.m0 = null;
                xkVar.n0 = 1.0f;
                xkVar.m0();
                break;
            case 3:
                on0 on0Var = (on0) this.b;
                on0Var.q = false;
                on0Var.dismiss();
                break;
            case 4:
                pn0 pn0Var = (pn0) this.b;
                pn0Var.s = false;
                pn0Var.r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == pn0Var.f) {
                    pn0Var.f = null;
                    break;
                }
                break;
            case 5:
                yo0 yo0Var = (yo0) this.b;
                yo0Var.A1.setVisibility(8);
                yo0Var.v2.setVisibility(8);
                wo0 wo0Var = yo0Var.H1;
                wo0Var.f = null;
                wo0Var.f();
                yo0Var.x2 = null;
                yo0Var.I2 = false;
                break;
            default:
                yo0 yo0Var2 = ((ho0) this.b).d;
                yo0Var2.B1.setVisibility(8);
                yo0Var2.C1.setVisibility(8);
                yo0Var2.u2.setVisibility(8);
                yo0Var2.x2 = null;
                break;
        }
    }
}
