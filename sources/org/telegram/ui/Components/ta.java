package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ta(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                cc ccVar = (cc) this.b;
                if (ccVar.d == gVar) {
                    ccVar.d = null;
                    break;
                }
                break;
            case 1:
                pa paVar = (pa) this.b;
                if (!z9) {
                    paVar.run();
                    break;
                }
                break;
            case 2:
                ik ikVar = (ik) this.b;
                ikVar.l0 = null;
                ikVar.m0 = 1.0f;
                ikVar.m0();
                break;
            case 3:
                bn0 bn0Var = (bn0) this.b;
                bn0Var.q = false;
                bn0Var.dismiss();
                break;
            case 4:
                cn0 cn0Var = (cn0) this.b;
                cn0Var.s = false;
                cn0Var.r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == cn0Var.f) {
                    cn0Var.f = null;
                    break;
                }
                break;
            case 5:
                mo0 mo0Var = (mo0) this.b;
                mo0Var.w1.setVisibility(8);
                mo0Var.r2.setVisibility(8);
                ko0 ko0Var = mo0Var.D1;
                ko0Var.f = null;
                ko0Var.f();
                mo0Var.t2 = null;
                mo0Var.E2 = false;
                break;
            default:
                mo0 mo0Var2 = ((vn0) this.b).d;
                mo0Var2.x1.setVisibility(8);
                mo0Var2.y1.setVisibility(8);
                mo0Var2.q2.setVisibility(8);
                mo0Var2.t2 = null;
                break;
        }
    }
}
