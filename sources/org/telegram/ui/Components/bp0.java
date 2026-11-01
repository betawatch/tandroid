package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ cp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(cp0 cp0Var, cp0 cp0Var2) {
        super(cp0Var2);
        this.x = cp0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final boolean b() {
        pp0 pp0Var = this.x.p0;
        if (pp0Var.I || !pp0Var.Q1) {
            return false;
        }
        return !pp0Var.k1.m();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void e(float f7, float f10, boolean z10) {
        cp0 cp0Var = this.x;
        pp0 pp0Var = cp0Var.p0;
        int i10 = pp0.Q2;
        for (int i11 = 0; i11 < pp0Var.b.getChildCount(); i11++) {
            View childAt = pp0Var.b.getChildAt(i11);
            if (childAt != pp0Var.n1 && childAt != pp0Var.s1 && childAt != pp0Var.K1[1] && childAt != pp0Var.u1 && childAt != pp0Var.j1 && childAt != pp0Var.U1 && childAt != pp0Var.m1) {
                childAt.setTranslationY(f7);
            }
        }
        po0 po0Var = pp0Var.x1;
        pp0Var.l2 = f7;
        int i12 = cp0Var.k0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            pp0Var.h2 = (int) ((cp0Var.l0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            po0Var.setTranslationY(f12);
            if (z10) {
                pp0Var.y1.setTranslationY(f12);
            } else {
                pp0Var.y1.setTranslationY(f12 + pp0Var.x1.getPaddingTop());
            }
        } else {
            int i13 = cp0Var.m0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                pp0Var.h2 = (int) ((cp0Var.n0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    po0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    po0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        pp0Var.x1.setTopGlowOffset((int) (pp0Var.h2 + pp0Var.l2));
        pp0Var.i1.setTranslationY(pp0Var.h2 + pp0Var.l2);
        pp0Var.I1.setTranslationY(pp0Var.h2 + pp0Var.l2);
        pp0Var.j1.invalidate();
        pp0Var.E0 = pp0Var.l2;
        pp0Var.c.invalidate();
        pp0Var.Z0();
        cp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void f() {
        pp0 pp0Var = this.x.p0;
        uo0 uo0Var = pp0Var.k1;
        if (uo0Var == null || !uo0Var.m()) {
            int i10 = pp0Var.F2;
            org.telegram.messenger.i0.L(20.0f);
        }
        pp0Var.j2 = false;
        int i11 = pp0Var.h2;
        pp0Var.i2 = i11;
        pp0Var.x1.setTopGlowOffset(i11);
        pp0Var.i1.setTranslationY(pp0Var.h2);
        pp0Var.I1.setTranslationY(pp0Var.h2);
        pp0Var.x1.setTranslationY(0.0f);
        pp0Var.y1.setTranslationY(0.0f);
        pp0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void g(int i10, boolean z10) {
        cp0 cp0Var = this.x;
        pp0 pp0Var = cp0Var.p0;
        int i11 = pp0Var.i2;
        int i12 = pp0Var.h2;
        if (i11 != i12) {
            cp0Var.k0 = i11;
            cp0Var.l0 = i12;
            pp0Var.j2 = true;
            pp0Var.h2 = i11;
        } else {
            cp0Var.k0 = -1;
        }
        int i13 = cp0Var.i0;
        int i14 = cp0Var.j0;
        if (i13 != i14) {
            cp0Var.m0 = 0;
            cp0Var.n0 = 0;
            pp0Var.j2 = true;
            if (z10) {
                cp0Var.n0 = i13 - i14;
            } else {
                cp0Var.n0 = 0 - (i13 - i14);
            }
            pp0Var.h2 = z10 ? cp0Var.k0 : cp0Var.l0;
        } else {
            cp0Var.m0 = -1;
        }
        pp0Var.x1.setTopGlowOffset((int) (pp0Var.l2 + pp0Var.h2));
        pp0Var.i1.setTranslationY(pp0Var.l2 + pp0Var.h2);
        pp0Var.I1.setTranslationY(pp0Var.l2 + pp0Var.h2);
        cp0Var.invalidate();
    }
}
