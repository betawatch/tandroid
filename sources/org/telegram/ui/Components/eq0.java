package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class eq0 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ fq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq0(fq0 fq0Var, fq0 fq0Var2) {
        super(fq0Var2);
        this.x = fq0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        uq0 uq0Var = this.x.H0;
        if (uq0Var.isDismissed() || !uq0Var.Y) {
            return false;
        }
        return !uq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        fq0 fq0Var = this.x;
        uq0 uq0Var = fq0Var.H0;
        int i10 = uq0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) uq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != uq0Var.h && childAt != uq0Var.v && childAt != uq0Var.S[1] && childAt != uq0Var.x && childAt != uq0Var.c && childAt != uq0Var.c0 && childAt != uq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        wp0 wp0Var = uq0Var.F;
        uq0Var.t0 = f7;
        int i12 = fq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            uq0Var.p0 = (int) ((fq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            wp0Var.setTranslationY(f12);
            if (z10) {
                uq0Var.G.setTranslationY(f12);
            } else {
                uq0Var.G.setTranslationY(f12 + uq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = fq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                uq0Var.p0 = (int) ((fq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    wp0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    wp0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        uq0Var.F.setTopGlowOffset((int) (uq0Var.p0 + uq0Var.t0));
        uq0Var.b.setTranslationY(uq0Var.p0 + uq0Var.t0);
        uq0Var.Q.setTranslationY(uq0Var.p0 + uq0Var.t0);
        uq0Var.c.invalidate();
        uq0Var.setCurrentPanTranslationY(uq0Var.t0);
        uq0Var.Y0();
        fq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        uq0 uq0Var = this.x.H0;
        zp0 zp0Var = uq0Var.d;
        if (zp0Var == null || !zp0Var.m()) {
            int i10 = uq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        uq0Var.r0 = false;
        int i11 = uq0Var.p0;
        uq0Var.q0 = i11;
        uq0Var.F.setTopGlowOffset(i11);
        uq0Var.b.setTranslationY(uq0Var.p0);
        uq0Var.Q.setTranslationY(uq0Var.p0);
        uq0Var.F.setTranslationY(0.0f);
        uq0Var.G.setTranslationY(0.0f);
        uq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        fq0 fq0Var = this.x;
        uq0 uq0Var = fq0Var.H0;
        int i11 = uq0Var.q0;
        int i12 = uq0Var.p0;
        if (i11 != i12) {
            fq0Var.B0 = i11;
            fq0Var.C0 = i12;
            uq0Var.r0 = true;
            uq0Var.p0 = i11;
        } else {
            fq0Var.B0 = -1;
        }
        int i13 = fq0Var.z0;
        int i14 = fq0Var.A0;
        if (i13 != i14) {
            fq0Var.D0 = 0;
            fq0Var.E0 = 0;
            uq0Var.r0 = true;
            if (z10) {
                fq0Var.E0 = i13 - i14;
            } else {
                fq0Var.E0 = 0 - (i13 - i14);
            }
            uq0Var.p0 = z10 ? fq0Var.B0 : fq0Var.C0;
        } else {
            fq0Var.D0 = -1;
        }
        uq0Var.F.setTopGlowOffset((int) (uq0Var.t0 + uq0Var.p0));
        uq0Var.b.setTranslationY(uq0Var.t0 + uq0Var.p0);
        uq0Var.Q.setTranslationY(uq0Var.t0 + uq0Var.p0);
        fq0Var.invalidate();
    }
}
