package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bo0 extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ co0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(co0 co0Var, co0 co0Var2) {
        super(co0Var2);
        this.x = co0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        po0 po0Var = this.x.q0;
        if (po0Var.J || !po0Var.U1) {
            return false;
        }
        return !po0Var.o1.m();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        co0 co0Var = this.x;
        po0 po0Var = co0Var.q0;
        int i7 = po0.U2;
        for (int i10 = 0; i10 < po0Var.b.getChildCount(); i10++) {
            View childAt = po0Var.b.getChildAt(i10);
            if (childAt != po0Var.r1 && childAt != po0Var.w1 && childAt != po0Var.O1[1] && childAt != po0Var.y1 && childAt != po0Var.n1 && childAt != po0Var.Y1 && childAt != po0Var.q1) {
                childAt.setTranslationY(f10);
            }
        }
        rn0 rn0Var = po0Var.B1;
        po0Var.p2 = f10;
        int i11 = co0Var.l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            po0Var.l2 = (int) ((co0Var.m0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            rn0Var.setTranslationY(f13);
            if (z10) {
                po0Var.C1.setTranslationY(f13);
            } else {
                po0Var.C1.setTranslationY(f13 + po0Var.B1.getPaddingTop());
            }
        } else {
            int i12 = co0Var.n0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                po0Var.l2 = (int) ((co0Var.o0 * f11) + (i12 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    rn0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    rn0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        po0Var.B1.setTopGlowOffset((int) (po0Var.l2 + po0Var.p2));
        po0Var.m1.setTranslationY(po0Var.l2 + po0Var.p2);
        po0Var.M1.setTranslationY(po0Var.l2 + po0Var.p2);
        po0Var.n1.invalidate();
        po0Var.F0 = po0Var.p2;
        po0Var.c.invalidate();
        po0Var.Z0();
        co0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        po0 po0Var = this.x.q0;
        vn0 vn0Var = po0Var.o1;
        if (vn0Var == null || !vn0Var.m()) {
            int i7 = po0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        po0Var.n2 = false;
        int i10 = po0Var.l2;
        po0Var.m2 = i10;
        po0Var.B1.setTopGlowOffset(i10);
        po0Var.m1.setTranslationY(po0Var.l2);
        po0Var.M1.setTranslationY(po0Var.l2);
        po0Var.B1.setTranslationY(0.0f);
        po0Var.C1.setTranslationY(0.0f);
        po0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        co0 co0Var = this.x;
        po0 po0Var = co0Var.q0;
        int i10 = po0Var.m2;
        int i11 = po0Var.l2;
        if (i10 != i11) {
            co0Var.l0 = i10;
            co0Var.m0 = i11;
            po0Var.n2 = true;
            po0Var.l2 = i10;
        } else {
            co0Var.l0 = -1;
        }
        int i12 = co0Var.j0;
        int i13 = co0Var.k0;
        if (i12 != i13) {
            co0Var.n0 = 0;
            co0Var.o0 = 0;
            po0Var.n2 = true;
            if (z10) {
                co0Var.o0 = i12 - i13;
            } else {
                co0Var.o0 = 0 - (i12 - i13);
            }
            po0Var.l2 = z10 ? co0Var.l0 : co0Var.m0;
        } else {
            co0Var.n0 = -1;
        }
        po0Var.B1.setTopGlowOffset((int) (po0Var.p2 + po0Var.l2));
        po0Var.m1.setTranslationY(po0Var.p2 + po0Var.l2);
        po0Var.M1.setTranslationY(po0Var.p2 + po0Var.l2);
        co0Var.invalidate();
    }
}
