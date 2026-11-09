package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                cn0 cn0Var = (cn0) this.b;
                cn0Var.q = false;
                cn0Var.dismiss();
                break;
            case 4:
                dn0 dn0Var = (dn0) this.b;
                dn0Var.s = false;
                dn0Var.r = false;
                if (!z9) {
                    gVar.d();
                }
                if (gVar == dn0Var.f) {
                    dn0Var.f = null;
                    break;
                }
                break;
            case 5:
                no0 no0Var = (no0) this.b;
                no0Var.w1.setVisibility(8);
                no0Var.r2.setVisibility(8);
                lo0 lo0Var = no0Var.D1;
                lo0Var.f = null;
                lo0Var.f();
                no0Var.t2 = null;
                no0Var.E2 = false;
                break;
            default:
                no0 no0Var2 = ((wn0) this.b).d;
                no0Var2.x1.setVisibility(8);
                no0Var2.y1.setVisibility(8);
                no0Var2.q2.setVisibility(8);
                no0Var2.t2 = null;
                break;
        }
    }
}
