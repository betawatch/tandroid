package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lq0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ mq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(mq0 mq0Var, mq0 mq0Var2) {
        super(mq0Var2);
        this.x = mq0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        br0 br0Var = this.x.H0;
        if (br0Var.isDismissed() || !br0Var.Y) {
            return false;
        }
        return !br0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        mq0 mq0Var = this.x;
        br0 br0Var = mq0Var.H0;
        int i10 = br0.W0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) br0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != br0Var.h && childAt != br0Var.v && childAt != br0Var.S[1] && childAt != br0Var.x && childAt != br0Var.c && childAt != br0Var.c0 && childAt != br0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        bq0 bq0Var = br0Var.F;
        br0Var.t0 = f7;
        int i12 = mq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            br0Var.p0 = (int) ((mq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            bq0Var.setTranslationY(f12);
            if (z10) {
                br0Var.G.setTranslationY(f12);
            } else {
                br0Var.G.setTranslationY(f12 + br0Var.F.getPaddingTop());
            }
        } else {
            int i13 = mq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                br0Var.p0 = (int) ((mq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    bq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    bq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        br0Var.F.setTopGlowOffset((int) (br0Var.p0 + br0Var.t0));
        br0Var.b.setTranslationY(br0Var.p0 + br0Var.t0);
        br0Var.Q.setTranslationY(br0Var.p0 + br0Var.t0);
        br0Var.c.invalidate();
        br0Var.setCurrentPanTranslationY(br0Var.t0);
        br0Var.V0();
        mq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        br0 br0Var = this.x.H0;
        fq0 fq0Var = br0Var.d;
        if (fq0Var == null || !fq0Var.m()) {
            int i10 = br0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        br0Var.r0 = false;
        int i11 = br0Var.p0;
        br0Var.q0 = i11;
        br0Var.F.setTopGlowOffset(i11);
        br0Var.b.setTranslationY(br0Var.p0);
        br0Var.Q.setTranslationY(br0Var.p0);
        br0Var.F.setTranslationY(0.0f);
        br0Var.G.setTranslationY(0.0f);
        br0Var.V0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        mq0 mq0Var = this.x;
        br0 br0Var = mq0Var.H0;
        int i11 = br0Var.q0;
        int i12 = br0Var.p0;
        if (i11 != i12) {
            mq0Var.B0 = i11;
            mq0Var.C0 = i12;
            br0Var.r0 = true;
            br0Var.p0 = i11;
        } else {
            mq0Var.B0 = -1;
        }
        int i13 = mq0Var.z0;
        int i14 = mq0Var.A0;
        if (i13 != i14) {
            mq0Var.D0 = 0;
            mq0Var.E0 = 0;
            br0Var.r0 = true;
            if (z10) {
                mq0Var.E0 = i13 - i14;
            } else {
                mq0Var.E0 = 0 - (i13 - i14);
            }
            br0Var.p0 = z10 ? mq0Var.B0 : mq0Var.C0;
        } else {
            mq0Var.D0 = -1;
        }
        br0Var.F.setTopGlowOffset((int) (br0Var.t0 + br0Var.p0));
        br0Var.b.setTranslationY(br0Var.t0 + br0Var.p0);
        br0Var.Q.setTranslationY(br0Var.t0 + br0Var.p0);
        mq0Var.invalidate();
    }
}
