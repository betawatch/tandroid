package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sp0 extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ tp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(tp0 tp0Var, tp0 tp0Var2) {
        super(tp0Var2);
        this.x = tp0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        iq0 iq0Var = this.x.H0;
        if (iq0Var.isDismissed() || !iq0Var.Y) {
            return false;
        }
        return !iq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        tp0 tp0Var = this.x;
        iq0 iq0Var = tp0Var.H0;
        int i10 = iq0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != iq0Var.h && childAt != iq0Var.v && childAt != iq0Var.S[1] && childAt != iq0Var.x && childAt != iq0Var.c && childAt != iq0Var.c0 && childAt != iq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        kp0 kp0Var = iq0Var.F;
        iq0Var.t0 = f7;
        int i12 = tp0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            iq0Var.p0 = (int) ((tp0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            kp0Var.setTranslationY(f12);
            if (z10) {
                iq0Var.G.setTranslationY(f12);
            } else {
                iq0Var.G.setTranslationY(f12 + iq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = tp0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                iq0Var.p0 = (int) ((tp0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    kp0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    kp0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        iq0Var.F.setTopGlowOffset((int) (iq0Var.p0 + iq0Var.t0));
        iq0Var.b.setTranslationY(iq0Var.p0 + iq0Var.t0);
        iq0Var.Q.setTranslationY(iq0Var.p0 + iq0Var.t0);
        iq0Var.c.invalidate();
        iq0Var.setCurrentPanTranslationY(iq0Var.t0);
        iq0Var.Y0();
        tp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        iq0 iq0Var = this.x.H0;
        np0 np0Var = iq0Var.d;
        if (np0Var == null || !np0Var.m()) {
            int i10 = iq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        iq0Var.r0 = false;
        int i11 = iq0Var.p0;
        iq0Var.q0 = i11;
        iq0Var.F.setTopGlowOffset(i11);
        iq0Var.b.setTranslationY(iq0Var.p0);
        iq0Var.Q.setTranslationY(iq0Var.p0);
        iq0Var.F.setTranslationY(0.0f);
        iq0Var.G.setTranslationY(0.0f);
        iq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        tp0 tp0Var = this.x;
        iq0 iq0Var = tp0Var.H0;
        int i11 = iq0Var.q0;
        int i12 = iq0Var.p0;
        if (i11 != i12) {
            tp0Var.B0 = i11;
            tp0Var.C0 = i12;
            iq0Var.r0 = true;
            iq0Var.p0 = i11;
        } else {
            tp0Var.B0 = -1;
        }
        int i13 = tp0Var.z0;
        int i14 = tp0Var.A0;
        if (i13 != i14) {
            tp0Var.D0 = 0;
            tp0Var.E0 = 0;
            iq0Var.r0 = true;
            if (z10) {
                tp0Var.E0 = i13 - i14;
            } else {
                tp0Var.E0 = 0 - (i13 - i14);
            }
            iq0Var.p0 = z10 ? tp0Var.B0 : tp0Var.C0;
        } else {
            tp0Var.D0 = -1;
        }
        iq0Var.F.setTopGlowOffset((int) (iq0Var.t0 + iq0Var.p0));
        iq0Var.b.setTranslationY(iq0Var.t0 + iq0Var.p0);
        iq0Var.Q.setTranslationY(iq0Var.t0 + iq0Var.p0);
        tp0Var.invalidate();
    }
}
