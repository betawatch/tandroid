package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 extends sf.b {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public k0(i4 i4Var, a3 a3Var, org.telegram.ui.Components.t70 t70Var) {
        this.e = i4Var;
        this.f = a3Var;
        this.g = t70Var;
    }

    @Override // sf.b
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.c.n(i4Var.w, true);
                View view = i4Var.s;
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

    @Override // sf.b
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new aj(((hm) this.g).a, 10), 250L);
                    break;
                }
                break;
            default:
                super.c(z10);
                break;
        }
    }

    @Override // sf.b
    public final void d() {
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.t70 t70Var = (org.telegram.ui.Components.t70) this.g;
                i4 i4Var = (i4) this.e;
                m2.p0 p0Var = i4Var.c;
                a3 a3Var = (a3) this.f;
                i4Var.s = a3Var != null ? a3Var.b : null;
                p0Var.n(i4Var.w, true);
                if (a3Var != null) {
                    i4Var.w = m2.p0.k(a3Var.d, t70Var.i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ze, false);
                    i4Var.w.g(org.telegram.ui.ActionBar.k6.r1(0.8f, x02), org.telegram.ui.ActionBar.k6.r1(1.3f, x02), org.telegram.ui.ActionBar.k6.r1(1.0f, x02), org.telegram.ui.ActionBar.k6.r1(4.0f, x02));
                    i4Var.w.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                    p0Var.c(i4Var.w, a3Var);
                }
                View view = i4Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                hm hmVar = (hm) this.g;
                hmVar.a.Xb = ((org.telegram.messenger.zi) this.e).f1();
                wm wmVar = hmVar.a;
                wmVar.Yb = 0;
                wmVar.Zb = null;
                ((org.telegram.ui.Cells.q1) this.f).invalidate();
                break;
        }
    }

    public k0(hm hmVar, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.q1 q1Var) {
        this.g = hmVar;
        this.e = ziVar;
        this.f = q1Var;
    }
}
