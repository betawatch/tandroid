package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zn0 extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ ao0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(ao0 ao0Var, ao0 ao0Var2) {
        super(ao0Var2);
        this.x = ao0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        no0 no0Var = this.x.p0;
        if (no0Var.I || !no0Var.Q1) {
            return false;
        }
        return !no0Var.k1.m();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        ao0 ao0Var = this.x;
        no0 no0Var = ao0Var.p0;
        int i7 = no0.Q2;
        for (int i10 = 0; i10 < no0Var.b.getChildCount(); i10++) {
            View childAt = no0Var.b.getChildAt(i10);
            if (childAt != no0Var.n1 && childAt != no0Var.s1 && childAt != no0Var.K1[1] && childAt != no0Var.u1 && childAt != no0Var.j1 && childAt != no0Var.U1 && childAt != no0Var.m1) {
                childAt.setTranslationY(f10);
            }
        }
        pn0 pn0Var = no0Var.x1;
        no0Var.l2 = f10;
        int i11 = ao0Var.k0;
        if (i11 != -1) {
            if (!z9) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            no0Var.h2 = (int) ((ao0Var.l0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            pn0Var.setTranslationY(f13);
            if (z9) {
                no0Var.y1.setTranslationY(f13);
            } else {
                no0Var.y1.setTranslationY(f13 + no0Var.x1.getPaddingTop());
            }
        } else {
            int i12 = ao0Var.m0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                no0Var.h2 = (int) ((ao0Var.n0 * f11) + (i12 * f14));
                if (!z9) {
                    f14 = f11;
                }
                if (z9) {
                    pn0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    pn0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        no0Var.x1.setTopGlowOffset((int) (no0Var.h2 + no0Var.l2));
        no0Var.i1.setTranslationY(no0Var.h2 + no0Var.l2);
        no0Var.I1.setTranslationY(no0Var.h2 + no0Var.l2);
        no0Var.j1.invalidate();
        no0Var.E0 = no0Var.l2;
        no0Var.c.invalidate();
        no0Var.Z0();
        ao0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        no0 no0Var = this.x.p0;
        tn0 tn0Var = no0Var.k1;
        if (tn0Var == null || !tn0Var.m()) {
            int i7 = no0Var.F2;
            org.telegram.messenger.g0.L(20.0f);
        }
        no0Var.j2 = false;
        int i10 = no0Var.h2;
        no0Var.i2 = i10;
        no0Var.x1.setTopGlowOffset(i10);
        no0Var.i1.setTranslationY(no0Var.h2);
        no0Var.I1.setTranslationY(no0Var.h2);
        no0Var.x1.setTranslationY(0.0f);
        no0Var.y1.setTranslationY(0.0f);
        no0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        ao0 ao0Var = this.x;
        no0 no0Var = ao0Var.p0;
        int i10 = no0Var.i2;
        int i11 = no0Var.h2;
        if (i10 != i11) {
            ao0Var.k0 = i10;
            ao0Var.l0 = i11;
            no0Var.j2 = true;
            no0Var.h2 = i10;
        } else {
            ao0Var.k0 = -1;
        }
        int i12 = ao0Var.i0;
        int i13 = ao0Var.j0;
        if (i12 != i13) {
            ao0Var.m0 = 0;
            ao0Var.n0 = 0;
            no0Var.j2 = true;
            if (z9) {
                ao0Var.n0 = i12 - i13;
            } else {
                ao0Var.n0 = 0 - (i12 - i13);
            }
            no0Var.h2 = z9 ? ao0Var.k0 : ao0Var.l0;
        } else {
            ao0Var.m0 = -1;
        }
        no0Var.x1.setTopGlowOffset((int) (no0Var.l2 + no0Var.h2));
        no0Var.i1.setTranslationY(no0Var.l2 + no0Var.h2);
        no0Var.I1.setTranslationY(no0Var.l2 + no0Var.h2);
        ao0Var.invalidate();
    }
}
