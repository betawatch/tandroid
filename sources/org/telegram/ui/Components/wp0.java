package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wp0 extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ xp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(xp0 xp0Var, xp0 xp0Var2) {
        super(xp0Var2);
        this.x = xp0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        mq0 mq0Var = this.x.E0;
        if (mq0Var.isDismissed() || !mq0Var.V) {
            return false;
        }
        return !mq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11, boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        xp0 xp0Var = this.x;
        mq0 mq0Var = xp0Var.E0;
        int i10 = mq0.X0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) mq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != mq0Var.h && childAt != mq0Var.v && childAt != mq0Var.P[1] && childAt != mq0Var.x && childAt != mq0Var.c && childAt != mq0Var.Z && childAt != mq0Var.f) {
                childAt.setTranslationY(f10);
            }
        }
        np0 np0Var = mq0Var.C;
        mq0Var.q0 = f10;
        int i12 = xp0Var.y0;
        if (i12 != -1) {
            if (!z4) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            mq0Var.m0 = (int) ((xp0Var.z0 * f11) + (i12 * f12));
            float f13 = ((i12 - r6) * f12) + f10;
            np0Var.setTranslationY(f13);
            if (z4) {
                mq0Var.D.setTranslationY(f13);
            } else {
                mq0Var.D.setTranslationY(f13 + mq0Var.C.getPaddingTop());
            }
        } else {
            int i13 = xp0Var.A0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                mq0Var.m0 = (int) ((xp0Var.B0 * f11) + (i13 * f14));
                if (!z4) {
                    f14 = f11;
                }
                if (z4) {
                    np0Var.setTranslationY(f10 - ((i13 - r6) * f11));
                } else {
                    np0Var.setTranslationY(((r6 - i13) * f14) + f10);
                }
            }
        }
        mq0Var.C.setTopGlowOffset((int) (mq0Var.m0 + mq0Var.q0));
        mq0Var.b.setTranslationY(mq0Var.m0 + mq0Var.q0);
        mq0Var.N.setTranslationY(mq0Var.m0 + mq0Var.q0);
        mq0Var.c.invalidate();
        mq0Var.setCurrentPanTranslationY(mq0Var.q0);
        mq0Var.Y0();
        xp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        mq0 mq0Var = this.x.E0;
        qp0 qp0Var = mq0Var.d;
        if (qp0Var == null || !qp0Var.m()) {
            int i10 = mq0Var.K0;
            AndroidUtilities.dp(20.0f);
        }
        mq0Var.o0 = false;
        int i11 = mq0Var.m0;
        mq0Var.n0 = i11;
        mq0Var.C.setTopGlowOffset(i11);
        mq0Var.b.setTranslationY(mq0Var.m0);
        mq0Var.N.setTranslationY(mq0Var.m0);
        mq0Var.C.setTranslationY(0.0f);
        mq0Var.D.setTranslationY(0.0f);
        mq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        xp0 xp0Var = this.x;
        mq0 mq0Var = xp0Var.E0;
        int i11 = mq0Var.n0;
        int i12 = mq0Var.m0;
        if (i11 != i12) {
            xp0Var.y0 = i11;
            xp0Var.z0 = i12;
            mq0Var.o0 = true;
            mq0Var.m0 = i11;
        } else {
            xp0Var.y0 = -1;
        }
        int i13 = xp0Var.w0;
        int i14 = xp0Var.x0;
        if (i13 != i14) {
            xp0Var.A0 = 0;
            xp0Var.B0 = 0;
            mq0Var.o0 = true;
            if (z4) {
                xp0Var.B0 = i13 - i14;
            } else {
                xp0Var.B0 = 0 - (i13 - i14);
            }
            mq0Var.m0 = z4 ? xp0Var.y0 : xp0Var.z0;
        } else {
            xp0Var.A0 = -1;
        }
        mq0Var.C.setTopGlowOffset((int) (mq0Var.q0 + mq0Var.m0));
        mq0Var.b.setTranslationY(mq0Var.q0 + mq0Var.m0);
        mq0Var.N.setTranslationY(mq0Var.q0 + mq0Var.m0);
        xp0Var.invalidate();
    }
}
