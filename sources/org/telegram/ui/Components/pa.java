package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                xb xbVar = (xb) this.b;
                if (xbVar.d == gVar) {
                    xbVar.d = null;
                    break;
                }
                break;
            case 1:
                la laVar = (la) this.b;
                if (!z10) {
                    laVar.run();
                    break;
                }
                break;
            case 2:
                qk qkVar = (qk) this.b;
                qkVar.m0 = null;
                qkVar.n0 = 1.0f;
                qkVar.m0();
                break;
            case 3:
                fn0 fn0Var = (fn0) this.b;
                fn0Var.q = false;
                fn0Var.dismiss();
                break;
            case 4:
                gn0 gn0Var = (gn0) this.b;
                gn0Var.s = false;
                gn0Var.r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == gn0Var.f) {
                    gn0Var.f = null;
                    break;
                }
                break;
            case 5:
                po0 po0Var = (po0) this.b;
                po0Var.A1.setVisibility(8);
                po0Var.v2.setVisibility(8);
                no0 no0Var = po0Var.H1;
                no0Var.f = null;
                no0Var.f();
                po0Var.x2 = null;
                po0Var.I2 = false;
                break;
            default:
                po0 po0Var2 = ((yn0) this.b).d;
                po0Var2.B1.setVisibility(8);
                po0Var2.C1.setVisibility(8);
                po0Var2.u2.setVisibility(8);
                po0Var2.x2 = null;
                break;
        }
    }
}
