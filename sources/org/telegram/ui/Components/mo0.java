package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mo0 extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ no0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(no0 no0Var, no0 no0Var2) {
        super(no0Var2);
        this.x = no0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        ap0 ap0Var = this.x.q0;
        if (ap0Var.J || !ap0Var.U1) {
            return false;
        }
        return !ap0Var.o1.m();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        no0 no0Var = this.x;
        ap0 ap0Var = no0Var.q0;
        int i7 = ap0.U2;
        for (int i10 = 0; i10 < ap0Var.b.getChildCount(); i10++) {
            View childAt = ap0Var.b.getChildAt(i10);
            if (childAt != ap0Var.r1 && childAt != ap0Var.w1 && childAt != ap0Var.O1[1] && childAt != ap0Var.y1 && childAt != ap0Var.n1 && childAt != ap0Var.Y1 && childAt != ap0Var.q1) {
                childAt.setTranslationY(f10);
            }
        }
        co0 co0Var = ap0Var.B1;
        ap0Var.p2 = f10;
        int i11 = no0Var.l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            ap0Var.l2 = (int) ((no0Var.m0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            co0Var.setTranslationY(f13);
            if (z10) {
                ap0Var.C1.setTranslationY(f13);
            } else {
                ap0Var.C1.setTranslationY(f13 + ap0Var.B1.getPaddingTop());
            }
        } else {
            int i12 = no0Var.n0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                ap0Var.l2 = (int) ((no0Var.o0 * f11) + (i12 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    co0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    co0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        ap0Var.B1.setTopGlowOffset((int) (ap0Var.l2 + ap0Var.p2));
        ap0Var.m1.setTranslationY(ap0Var.l2 + ap0Var.p2);
        ap0Var.M1.setTranslationY(ap0Var.l2 + ap0Var.p2);
        ap0Var.n1.invalidate();
        ap0Var.F0 = ap0Var.p2;
        ap0Var.c.invalidate();
        ap0Var.a1();
        no0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        ap0 ap0Var = this.x.q0;
        go0 go0Var = ap0Var.o1;
        if (go0Var == null || !go0Var.m()) {
            int i7 = ap0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        ap0Var.n2 = false;
        int i10 = ap0Var.l2;
        ap0Var.m2 = i10;
        ap0Var.B1.setTopGlowOffset(i10);
        ap0Var.m1.setTranslationY(ap0Var.l2);
        ap0Var.M1.setTranslationY(ap0Var.l2);
        ap0Var.B1.setTranslationY(0.0f);
        ap0Var.C1.setTranslationY(0.0f);
        ap0Var.a1();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        no0 no0Var = this.x;
        ap0 ap0Var = no0Var.q0;
        int i10 = ap0Var.m2;
        int i11 = ap0Var.l2;
        if (i10 != i11) {
            no0Var.l0 = i10;
            no0Var.m0 = i11;
            ap0Var.n2 = true;
            ap0Var.l2 = i10;
        } else {
            no0Var.l0 = -1;
        }
        int i12 = no0Var.j0;
        int i13 = no0Var.k0;
        if (i12 != i13) {
            no0Var.n0 = 0;
            no0Var.o0 = 0;
            ap0Var.n2 = true;
            if (z10) {
                no0Var.o0 = i12 - i13;
            } else {
                no0Var.o0 = 0 - (i12 - i13);
            }
            ap0Var.l2 = z10 ? no0Var.l0 : no0Var.m0;
        } else {
            no0Var.n0 = -1;
        }
        ap0Var.B1.setTopGlowOffset((int) (ap0Var.p2 + ap0Var.l2));
        ap0Var.m1.setTranslationY(ap0Var.p2 + ap0Var.l2);
        ap0Var.M1.setTranslationY(ap0Var.p2 + ap0Var.l2);
        no0Var.invalidate();
    }
}
