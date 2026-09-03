package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vp0 extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ wp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(wp0 wp0Var, wp0 wp0Var2) {
        super(wp0Var2);
        this.x = wp0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        lq0 lq0Var = this.x.E0;
        if (lq0Var.isDismissed() || !lq0Var.V) {
            return false;
        }
        return !lq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11, boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        wp0 wp0Var = this.x;
        lq0 lq0Var = wp0Var.E0;
        int i10 = lq0.X0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != lq0Var.h && childAt != lq0Var.v && childAt != lq0Var.P[1] && childAt != lq0Var.x && childAt != lq0Var.c && childAt != lq0Var.Z && childAt != lq0Var.f) {
                childAt.setTranslationY(f10);
            }
        }
        mp0 mp0Var = lq0Var.C;
        lq0Var.q0 = f10;
        int i12 = wp0Var.y0;
        if (i12 != -1) {
            if (!z4) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            lq0Var.m0 = (int) ((wp0Var.z0 * f11) + (i12 * f12));
            float f13 = ((i12 - r6) * f12) + f10;
            mp0Var.setTranslationY(f13);
            if (z4) {
                lq0Var.D.setTranslationY(f13);
            } else {
                lq0Var.D.setTranslationY(f13 + lq0Var.C.getPaddingTop());
            }
        } else {
            int i13 = wp0Var.A0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                lq0Var.m0 = (int) ((wp0Var.B0 * f11) + (i13 * f14));
                if (!z4) {
                    f14 = f11;
                }
                if (z4) {
                    mp0Var.setTranslationY(f10 - ((i13 - r6) * f11));
                } else {
                    mp0Var.setTranslationY(((r6 - i13) * f14) + f10);
                }
            }
        }
        lq0Var.C.setTopGlowOffset((int) (lq0Var.m0 + lq0Var.q0));
        lq0Var.b.setTranslationY(lq0Var.m0 + lq0Var.q0);
        lq0Var.N.setTranslationY(lq0Var.m0 + lq0Var.q0);
        lq0Var.c.invalidate();
        lq0Var.setCurrentPanTranslationY(lq0Var.q0);
        lq0Var.Y0();
        wp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        lq0 lq0Var = this.x.E0;
        pp0 pp0Var = lq0Var.d;
        if (pp0Var == null || !pp0Var.m()) {
            int i10 = lq0Var.K0;
            AndroidUtilities.dp(20.0f);
        }
        lq0Var.o0 = false;
        int i11 = lq0Var.m0;
        lq0Var.n0 = i11;
        lq0Var.C.setTopGlowOffset(i11);
        lq0Var.b.setTranslationY(lq0Var.m0);
        lq0Var.N.setTranslationY(lq0Var.m0);
        lq0Var.C.setTranslationY(0.0f);
        lq0Var.D.setTranslationY(0.0f);
        lq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        wp0 wp0Var = this.x;
        lq0 lq0Var = wp0Var.E0;
        int i11 = lq0Var.n0;
        int i12 = lq0Var.m0;
        if (i11 != i12) {
            wp0Var.y0 = i11;
            wp0Var.z0 = i12;
            lq0Var.o0 = true;
            lq0Var.m0 = i11;
        } else {
            wp0Var.y0 = -1;
        }
        int i13 = wp0Var.w0;
        int i14 = wp0Var.x0;
        if (i13 != i14) {
            wp0Var.A0 = 0;
            wp0Var.B0 = 0;
            lq0Var.o0 = true;
            if (z4) {
                wp0Var.B0 = i13 - i14;
            } else {
                wp0Var.B0 = 0 - (i13 - i14);
            }
            lq0Var.m0 = z4 ? wp0Var.y0 : wp0Var.z0;
        } else {
            wp0Var.A0 = -1;
        }
        lq0Var.C.setTopGlowOffset((int) (lq0Var.q0 + lq0Var.m0));
        lq0Var.b.setTranslationY(lq0Var.q0 + lq0Var.m0);
        lq0Var.N.setTranslationY(lq0Var.q0 + lq0Var.m0);
        wp0Var.invalidate();
    }
}
