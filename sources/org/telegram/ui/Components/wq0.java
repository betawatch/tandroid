package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wq0 extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ xq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(xq0 xq0Var, xq0 xq0Var2) {
        super(xq0Var2);
        this.x = xq0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        mr0 mr0Var = this.x.v0;
        if (mr0Var.isDismissed() || !mr0Var.Z) {
            return false;
        }
        return !mr0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        xq0 xq0Var = this.x;
        mr0 mr0Var = xq0Var.v0;
        int i10 = mr0.Z0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) mr0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != mr0Var.h && childAt != mr0Var.w && childAt != mr0Var.T[1] && childAt != mr0Var.y && childAt != mr0Var.c && childAt != mr0Var.d0 && childAt != mr0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        nq0 nq0Var = mr0Var.G;
        mr0Var.u0 = f7;
        int i12 = xq0Var.q0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            mr0Var.q0 = (int) ((xq0Var.r0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            nq0Var.setTranslationY(f12);
            if (z10) {
                mr0Var.H.setTranslationY(f12);
            } else {
                mr0Var.H.setTranslationY(f12 + mr0Var.G.getPaddingTop());
            }
        } else {
            int i13 = xq0Var.s0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                mr0Var.q0 = (int) ((xq0Var.t0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    nq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    nq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        mr0Var.G.setTopGlowOffset((int) (mr0Var.q0 + mr0Var.u0));
        mr0Var.b.setTranslationY(mr0Var.q0 + mr0Var.u0);
        mr0Var.R.setTranslationY(mr0Var.q0 + mr0Var.u0);
        mr0Var.c.invalidate();
        mr0Var.setCurrentPanTranslationY(mr0Var.u0);
        mr0Var.b1();
        xq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        mr0 mr0Var = this.x.v0;
        rq0 rq0Var = mr0Var.d;
        if (rq0Var == null || !rq0Var.m()) {
            int i10 = mr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        mr0Var.s0 = false;
        int i11 = mr0Var.q0;
        mr0Var.r0 = i11;
        mr0Var.G.setTopGlowOffset(i11);
        mr0Var.b.setTranslationY(mr0Var.q0);
        mr0Var.R.setTranslationY(mr0Var.q0);
        mr0Var.G.setTranslationY(0.0f);
        mr0Var.H.setTranslationY(0.0f);
        mr0Var.b1();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        xq0 xq0Var = this.x;
        mr0 mr0Var = xq0Var.v0;
        int i11 = mr0Var.r0;
        int i12 = mr0Var.q0;
        if (i11 != i12) {
            xq0Var.q0 = i11;
            xq0Var.r0 = i12;
            mr0Var.s0 = true;
            mr0Var.q0 = i11;
        } else {
            xq0Var.q0 = -1;
        }
        int i13 = xq0Var.o0;
        int i14 = xq0Var.p0;
        if (i13 != i14) {
            xq0Var.s0 = 0;
            xq0Var.t0 = 0;
            mr0Var.s0 = true;
            if (z10) {
                xq0Var.t0 = i13 - i14;
            } else {
                xq0Var.t0 = 0 - (i13 - i14);
            }
            mr0Var.q0 = z10 ? xq0Var.q0 : xq0Var.r0;
        } else {
            xq0Var.s0 = -1;
        }
        mr0Var.G.setTopGlowOffset((int) (mr0Var.u0 + mr0Var.q0));
        mr0Var.b.setTranslationY(mr0Var.u0 + mr0Var.q0);
        mr0Var.R.setTranslationY(mr0Var.u0 + mr0Var.q0);
        xq0Var.invalidate();
    }
}
