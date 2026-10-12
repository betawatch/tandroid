package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                sc scVar = (sc) this.b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    break;
                }
                break;
            case 1:
                fb fbVar = (fb) this.b;
                if (!z10) {
                    fbVar.run();
                    break;
                }
                break;
            case 2:
                dl dlVar = (dl) this.b;
                dlVar.i0 = null;
                dlVar.j0 = 1.0f;
                dlVar.k0();
                break;
            case 3:
                wp0 wp0Var = (wp0) this.b;
                wp0Var.q = false;
                wp0Var.dismiss();
                break;
            case 4:
                xp0 xp0Var = (xp0) this.b;
                xp0Var.s = false;
                xp0Var.r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xp0Var.f) {
                    xp0Var.f = null;
                    break;
                }
                break;
            case 5:
                jr0 jr0Var = (jr0) this.b;
                jr0Var.E.setVisibility(8);
                jr0Var.z0.setVisibility(8);
                gr0 gr0Var = jr0Var.L;
                gr0Var.f = null;
                gr0Var.l();
                jr0Var.B0 = null;
                jr0Var.M0 = false;
                break;
            default:
                jr0 jr0Var2 = ((qq0) this.b).d;
                jr0Var2.F.setVisibility(8);
                jr0Var2.G.setVisibility(8);
                jr0Var2.y0.setVisibility(8);
                jr0Var2.B0 = null;
                break;
        }
    }
}
