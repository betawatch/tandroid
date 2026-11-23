package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j0 extends vf.b {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.k80 k80Var) {
        this.e = g4Var;
        this.f = z2Var;
        this.g = k80Var;
    }

    @Override // vf.b
    public void b() {
        switch (this.d) {
            case 0:
                g4 g4Var = (g4) this.e;
                g4Var.c.n(g4Var.w, true);
                View view = g4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                break;
            default:
                super.b();
                break;
        }
    }

    @Override // vf.b
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new fj(((mm) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) this.g;
                g4 g4Var = (g4) this.e;
                n2.p0 p0Var = g4Var.c;
                z2 z2Var = (z2) this.f;
                g4Var.s = z2Var != null ? z2Var.b : null;
                p0Var.n(g4Var.w, true);
                if (z2Var != null) {
                    g4Var.w = n2.p0.k(z2Var.d, k80Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ce, false);
                    g4Var.w.g(org.telegram.ui.ActionBar.n6.r1(0.8f, x02), org.telegram.ui.ActionBar.n6.r1(1.3f, x02), org.telegram.ui.ActionBar.n6.r1(1.0f, x02), org.telegram.ui.ActionBar.n6.r1(4.0f, x02));
                    g4Var.w.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    p0Var.c(g4Var.w, z2Var);
                }
                View view = g4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                mm mmVar = (mm) this.g;
                mmVar.a.ac = ((org.telegram.messenger.fj) this.e).e1();
                bn bnVar = mmVar.a;
                bnVar.bc = 0;
                bnVar.cc = null;
                ((org.telegram.ui.Cells.r1) this.f).invalidate();
                break;
        }
    }

    public j0(mm mmVar, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.r1 r1Var) {
        this.g = mmVar;
        this.e = fjVar;
        this.f = r1Var;
    }
}
