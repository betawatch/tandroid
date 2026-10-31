package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                co0 co0Var = (co0) this.b;
                co0Var.q = false;
                co0Var.dismiss();
                break;
            case 4:
                do0 do0Var = (do0) this.b;
                do0Var.s = false;
                do0Var.r = false;
                if (!z10) {
                    jVar.d();
                }
                if (jVar == do0Var.f) {
                    do0Var.f = null;
                    break;
                }
                break;
            case 5:
                op0 op0Var = (op0) this.b;
                op0Var.w1.setVisibility(8);
                op0Var.r2.setVisibility(8);
                mp0 mp0Var = op0Var.D1;
                mp0Var.f = null;
                mp0Var.f();
                op0Var.t2 = null;
                op0Var.E2 = false;
                break;
            default:
                op0 op0Var2 = ((xo0) this.b).d;
                op0Var2.x1.setVisibility(8);
                op0Var2.y1.setVisibility(8);
                op0Var2.q2.setVisibility(8);
                op0Var2.t2 = null;
                break;
        }
    }
}
