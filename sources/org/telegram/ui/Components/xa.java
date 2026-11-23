package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                fc fcVar = (fc) this.b;
                if (fcVar.d == gVar) {
                    fcVar.d = null;
                    break;
                }
                break;
            case 1:
                ta taVar = (ta) this.b;
                if (!z10) {
                    taVar.run();
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
                pn0 pn0Var = (pn0) this.b;
                pn0Var.q = false;
                pn0Var.dismiss();
                break;
            case 4:
                qn0 qn0Var = (qn0) this.b;
                qn0Var.s = false;
                qn0Var.r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == qn0Var.f) {
                    qn0Var.f = null;
                    break;
                }
                break;
            case 5:
                zo0 zo0Var = (zo0) this.b;
                zo0Var.A1.setVisibility(8);
                zo0Var.v2.setVisibility(8);
                xo0 xo0Var = zo0Var.H1;
                xo0Var.f = null;
                xo0Var.f();
                zo0Var.x2 = null;
                zo0Var.I2 = false;
                break;
            default:
                zo0 zo0Var2 = ((io0) this.b).d;
                zo0Var2.B1.setVisibility(8);
                zo0Var2.C1.setVisibility(8);
                zo0Var2.u2.setVisibility(8);
                zo0Var2.x2 = null;
                break;
        }
    }
}
