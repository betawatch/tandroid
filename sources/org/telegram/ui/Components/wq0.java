package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wq0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ xq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(xq0 xq0Var, xq0 xq0Var2) {
        super(xq0Var2);
        this.x = xq0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        mr0 mr0Var = this.x.H0;
        if (mr0Var.isDismissed() || !mr0Var.Y) {
            return false;
        }
        return !mr0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        xq0 xq0Var = this.x;
        mr0 mr0Var = xq0Var.H0;
        int i10 = mr0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) mr0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != mr0Var.h && childAt != mr0Var.v && childAt != mr0Var.S[1] && childAt != mr0Var.x && childAt != mr0Var.c && childAt != mr0Var.c0 && childAt != mr0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        oq0 oq0Var = mr0Var.F;
        mr0Var.t0 = f7;
        int i12 = xq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            mr0Var.p0 = (int) ((xq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            oq0Var.setTranslationY(f12);
            if (z10) {
                mr0Var.G.setTranslationY(f12);
            } else {
                mr0Var.G.setTranslationY(f12 + mr0Var.F.getPaddingTop());
            }
        } else {
            int i13 = xq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                mr0Var.p0 = (int) ((xq0Var.E0 * f10) + (i13 * f13));
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
        mr0Var.F.setTopGlowOffset((int) (mr0Var.p0 + mr0Var.t0));
        mr0Var.b.setTranslationY(mr0Var.p0 + mr0Var.t0);
        mr0Var.Q.setTranslationY(mr0Var.p0 + mr0Var.t0);
        mr0Var.c.invalidate();
        mr0Var.setCurrentPanTranslationY(mr0Var.t0);
        mr0Var.Z0();
        xq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        mr0 mr0Var = this.x.H0;
        rq0 rq0Var = mr0Var.d;
        if (rq0Var == null || !rq0Var.m()) {
            int i10 = mr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        mr0Var.r0 = false;
        int i11 = mr0Var.p0;
        mr0Var.q0 = i11;
        mr0Var.F.setTopGlowOffset(i11);
        mr0Var.b.setTranslationY(mr0Var.p0);
        mr0Var.Q.setTranslationY(mr0Var.p0);
        mr0Var.F.setTranslationY(0.0f);
        mr0Var.G.setTranslationY(0.0f);
        mr0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        xq0 xq0Var = this.x;
        mr0 mr0Var = xq0Var.H0;
        int i11 = mr0Var.q0;
        int i12 = mr0Var.p0;
        if (i11 != i12) {
            xq0Var.B0 = i11;
            xq0Var.C0 = i12;
            mr0Var.r0 = true;
            mr0Var.p0 = i11;
        } else {
            xq0Var.B0 = -1;
        }
        int i13 = xq0Var.z0;
        int i14 = xq0Var.A0;
        if (i13 != i14) {
            xq0Var.D0 = 0;
            xq0Var.E0 = 0;
            mr0Var.r0 = true;
            if (z10) {
                xq0Var.E0 = i13 - i14;
            } else {
                xq0Var.E0 = 0 - (i13 - i14);
            }
            mr0Var.p0 = z10 ? xq0Var.B0 : xq0Var.C0;
        } else {
            xq0Var.D0 = -1;
        }
        mr0Var.F.setTopGlowOffset((int) (mr0Var.t0 + mr0Var.p0));
        mr0Var.b.setTranslationY(mr0Var.t0 + mr0Var.p0);
        mr0Var.Q.setTranslationY(mr0Var.t0 + mr0Var.p0);
        xq0Var.invalidate();
    }
}
