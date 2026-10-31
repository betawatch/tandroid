package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ap0 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ bp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(bp0 bp0Var, bp0 bp0Var2) {
        super(bp0Var2);
        this.x = bp0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final boolean b() {
        op0 op0Var = this.x.p0;
        if (op0Var.I || !op0Var.Q1) {
            return false;
        }
        return !op0Var.k1.m();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void e(float f7, float f10, boolean z10) {
        bp0 bp0Var = this.x;
        op0 op0Var = bp0Var.p0;
        int i10 = op0.Q2;
        for (int i11 = 0; i11 < op0Var.b.getChildCount(); i11++) {
            View childAt = op0Var.b.getChildAt(i11);
            if (childAt != op0Var.n1 && childAt != op0Var.s1 && childAt != op0Var.K1[1] && childAt != op0Var.u1 && childAt != op0Var.j1 && childAt != op0Var.U1 && childAt != op0Var.m1) {
                childAt.setTranslationY(f7);
            }
        }
        oo0 oo0Var = op0Var.x1;
        op0Var.l2 = f7;
        int i12 = bp0Var.k0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            op0Var.h2 = (int) ((bp0Var.l0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            oo0Var.setTranslationY(f12);
            if (z10) {
                op0Var.y1.setTranslationY(f12);
            } else {
                op0Var.y1.setTranslationY(f12 + op0Var.x1.getPaddingTop());
            }
        } else {
            int i13 = bp0Var.m0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                op0Var.h2 = (int) ((bp0Var.n0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    oo0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    oo0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        op0Var.x1.setTopGlowOffset((int) (op0Var.h2 + op0Var.l2));
        op0Var.i1.setTranslationY(op0Var.h2 + op0Var.l2);
        op0Var.I1.setTranslationY(op0Var.h2 + op0Var.l2);
        op0Var.j1.invalidate();
        op0Var.E0 = op0Var.l2;
        op0Var.c.invalidate();
        op0Var.Z0();
        bp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void f() {
        op0 op0Var = this.x.p0;
        to0 to0Var = op0Var.k1;
        if (to0Var == null || !to0Var.m()) {
            int i10 = op0Var.F2;
            org.telegram.messenger.i0.L(20.0f);
        }
        op0Var.j2 = false;
        int i11 = op0Var.h2;
        op0Var.i2 = i11;
        op0Var.x1.setTopGlowOffset(i11);
        op0Var.i1.setTranslationY(op0Var.h2);
        op0Var.I1.setTranslationY(op0Var.h2);
        op0Var.x1.setTranslationY(0.0f);
        op0Var.y1.setTranslationY(0.0f);
        op0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void g(int i10, boolean z10) {
        bp0 bp0Var = this.x;
        op0 op0Var = bp0Var.p0;
        int i11 = op0Var.i2;
        int i12 = op0Var.h2;
        if (i11 != i12) {
            bp0Var.k0 = i11;
            bp0Var.l0 = i12;
            op0Var.j2 = true;
            op0Var.h2 = i11;
        } else {
            bp0Var.k0 = -1;
        }
        int i13 = bp0Var.i0;
        int i14 = bp0Var.j0;
        if (i13 != i14) {
            bp0Var.m0 = 0;
            bp0Var.n0 = 0;
            op0Var.j2 = true;
            if (z10) {
                bp0Var.n0 = i13 - i14;
            } else {
                bp0Var.n0 = 0 - (i13 - i14);
            }
            op0Var.h2 = z10 ? bp0Var.k0 : bp0Var.l0;
        } else {
            bp0Var.m0 = -1;
        }
        op0Var.x1.setTopGlowOffset((int) (op0Var.l2 + op0Var.h2));
        op0Var.i1.setTranslationY(op0Var.l2 + op0Var.h2);
        op0Var.I1.setTranslationY(op0Var.l2 + op0Var.h2);
        bp0Var.invalidate();
    }
}
