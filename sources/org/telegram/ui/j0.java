package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j0 extends vf.b {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public j0(g4 g4Var, z2 z2Var, org.telegram.ui.Components.x70 x70Var) {
        this.e = g4Var;
        this.f = z2Var;
        this.g = x70Var;
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
    public void c(boolean z9) {
        switch (this.d) {
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new ej(((lm) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z9);
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) this.g;
                g4 g4Var = (g4) this.e;
                n2.n0 n0Var = g4Var.c;
                z2 z2Var = (z2) this.f;
                g4Var.s = z2Var != null ? z2Var.b : null;
                n0Var.n(g4Var.w, true);
                if (z2Var != null) {
                    g4Var.w = n2.n0.k(z2Var.d, x70Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ze, false);
                    g4Var.w.g(org.telegram.ui.ActionBar.k6.r1(0.8f, x02), org.telegram.ui.ActionBar.k6.r1(1.3f, x02), org.telegram.ui.ActionBar.k6.r1(1.0f, x02), org.telegram.ui.ActionBar.k6.r1(4.0f, x02));
                    g4Var.w.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    n0Var.c(g4Var.w, z2Var);
                }
                View view = g4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                lm lmVar = (lm) this.g;
                lmVar.a.Wb = ((org.telegram.messenger.ij) this.e).f1();
                an anVar = lmVar.a;
                anVar.Xb = 0;
                anVar.Yb = null;
                ((org.telegram.ui.Cells.q1) this.f).invalidate();
                break;
        }
    }

    public j0(lm lmVar, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var) {
        this.g = lmVar;
        this.e = ijVar;
        this.f = q1Var;
    }
}
