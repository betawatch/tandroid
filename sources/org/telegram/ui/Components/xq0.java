package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xq0 extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ yq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(yq0 yq0Var, yq0 yq0Var2) {
        super(yq0Var2);
        this.x = yq0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        nr0 nr0Var = this.x.v0;
        if (nr0Var.isDismissed() || !nr0Var.Z) {
            return false;
        }
        return !nr0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        yq0 yq0Var = this.x;
        nr0 nr0Var = yq0Var.v0;
        int i10 = nr0.Z0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) nr0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != nr0Var.h && childAt != nr0Var.w && childAt != nr0Var.T[1] && childAt != nr0Var.y && childAt != nr0Var.c && childAt != nr0Var.d0 && childAt != nr0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        oq0 oq0Var = nr0Var.G;
        nr0Var.u0 = f7;
        int i12 = yq0Var.q0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            nr0Var.q0 = (int) ((yq0Var.r0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            oq0Var.setTranslationY(f12);
            if (z10) {
                nr0Var.H.setTranslationY(f12);
            } else {
                nr0Var.H.setTranslationY(f12 + nr0Var.G.getPaddingTop());
            }
        } else {
            int i13 = yq0Var.s0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                nr0Var.q0 = (int) ((yq0Var.t0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    oq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    oq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        nr0Var.G.setTopGlowOffset((int) (nr0Var.q0 + nr0Var.u0));
        nr0Var.b.setTranslationY(nr0Var.q0 + nr0Var.u0);
        nr0Var.R.setTranslationY(nr0Var.q0 + nr0Var.u0);
        nr0Var.c.invalidate();
        nr0Var.setCurrentPanTranslationY(nr0Var.u0);
        nr0Var.b1();
        yq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        nr0 nr0Var = this.x.v0;
        sq0 sq0Var = nr0Var.d;
        if (sq0Var == null || !sq0Var.m()) {
            int i10 = nr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        nr0Var.s0 = false;
        int i11 = nr0Var.q0;
        nr0Var.r0 = i11;
        nr0Var.G.setTopGlowOffset(i11);
        nr0Var.b.setTranslationY(nr0Var.q0);
        nr0Var.R.setTranslationY(nr0Var.q0);
        nr0Var.G.setTranslationY(0.0f);
        nr0Var.H.setTranslationY(0.0f);
        nr0Var.b1();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        yq0 yq0Var = this.x;
        nr0 nr0Var = yq0Var.v0;
        int i11 = nr0Var.r0;
        int i12 = nr0Var.q0;
        if (i11 != i12) {
            yq0Var.q0 = i11;
            yq0Var.r0 = i12;
            nr0Var.s0 = true;
            nr0Var.q0 = i11;
        } else {
            yq0Var.q0 = -1;
        }
        int i13 = yq0Var.o0;
        int i14 = yq0Var.p0;
        if (i13 != i14) {
            yq0Var.s0 = 0;
            yq0Var.t0 = 0;
            nr0Var.s0 = true;
            if (z10) {
                yq0Var.t0 = i13 - i14;
            } else {
                yq0Var.t0 = 0 - (i13 - i14);
            }
            nr0Var.q0 = z10 ? yq0Var.q0 : yq0Var.r0;
        } else {
            yq0Var.s0 = -1;
        }
        nr0Var.G.setTopGlowOffset((int) (nr0Var.u0 + nr0Var.q0));
        nr0Var.b.setTranslationY(nr0Var.u0 + nr0Var.q0);
        nr0Var.R.setTranslationY(nr0Var.u0 + nr0Var.q0);
        yq0Var.invalidate();
    }
}
