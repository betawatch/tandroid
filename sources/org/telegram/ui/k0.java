package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 extends gf.e {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public k0(h4 h4Var, z2 z2Var, org.telegram.ui.Components.q80 q80Var) {
        this.e = h4Var;
        this.f = z2Var;
        this.g = q80Var;
    }

    @Override // gf.e
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.c.n(h4Var.w, true);
                View view = h4Var.s;
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

    @Override // gf.e
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    org.telegram.messenger.i0.h3(new zj(((fn) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // gf.e
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.q80 q80Var = (org.telegram.ui.Components.q80) this.g;
                h4 h4Var = (h4) this.e;
                ji.a aVar = h4Var.c;
                z2 z2Var = (z2) this.f;
                h4Var.s = z2Var != null ? z2Var.b : null;
                aVar.n(h4Var.w, true);
                if (z2Var != null) {
                    h4Var.w = ji.a.k(z2Var.d, q80Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ze, false);
                    h4Var.w.g(org.telegram.ui.ActionBar.t6.r1(0.8f, x02), org.telegram.ui.ActionBar.t6.r1(1.3f, x02), org.telegram.ui.ActionBar.t6.r1(1.0f, x02), org.telegram.ui.ActionBar.t6.r1(4.0f, x02));
                    h4Var.w.x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
                    aVar.c(h4Var.w, z2Var);
                }
                View view = h4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                fn fnVar = (fn) this.g;
                fnVar.a.Rb = ((org.telegram.messenger.jj) this.e).f1();
                un unVar = fnVar.a;
                unVar.Sb = 0;
                unVar.Tb = null;
                ((org.telegram.ui.Cells.q1) this.f).invalidate();
                break;
        }
    }

    public k0(fn fnVar, org.telegram.messenger.jj jjVar, org.telegram.ui.Cells.q1 q1Var) {
        this.g = fnVar;
        this.e = jjVar;
        this.f = q1Var;
    }
}
