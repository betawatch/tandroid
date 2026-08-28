package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ cp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(cp0 cp0Var, cp0 cp0Var2) {
        super(cp0Var2);
        this.x = cp0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        rp0 rp0Var = this.x.D0;
        if (rp0Var.isDismissed() || !rp0Var.U) {
            return false;
        }
        return !rp0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        cp0 cp0Var = this.x;
        rp0 rp0Var = cp0Var.D0;
        int i9 = rp0.W0;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
            View childAt = viewGroup2.getChildAt(i10);
            if (childAt != rp0Var.h && childAt != rp0Var.v && childAt != rp0Var.O[1] && childAt != rp0Var.x && childAt != rp0Var.c && childAt != rp0Var.Y && childAt != rp0Var.f) {
                childAt.setTranslationY(f10);
            }
        }
        so0 so0Var = rp0Var.B;
        rp0Var.p0 = f10;
        int i11 = cp0Var.x0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            rp0Var.l0 = (int) ((cp0Var.y0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            so0Var.setTranslationY(f13);
            if (z10) {
                rp0Var.C.setTranslationY(f13);
            } else {
                rp0Var.C.setTranslationY(f13 + rp0Var.B.getPaddingTop());
            }
        } else {
            int i12 = cp0Var.z0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                rp0Var.l0 = (int) ((cp0Var.A0 * f11) + (i12 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    so0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    so0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        rp0Var.B.setTopGlowOffset((int) (rp0Var.l0 + rp0Var.p0));
        rp0Var.b.setTranslationY(rp0Var.l0 + rp0Var.p0);
        rp0Var.M.setTranslationY(rp0Var.l0 + rp0Var.p0);
        rp0Var.c.invalidate();
        rp0Var.setCurrentPanTranslationY(rp0Var.p0);
        rp0Var.Y0();
        cp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        rp0 rp0Var = this.x.D0;
        vo0 vo0Var = rp0Var.d;
        if (vo0Var == null || !vo0Var.m()) {
            int i9 = rp0Var.J0;
            AndroidUtilities.dp(20.0f);
        }
        rp0Var.n0 = false;
        int i10 = rp0Var.l0;
        rp0Var.m0 = i10;
        rp0Var.B.setTopGlowOffset(i10);
        rp0Var.b.setTranslationY(rp0Var.l0);
        rp0Var.M.setTranslationY(rp0Var.l0);
        rp0Var.B.setTranslationY(0.0f);
        rp0Var.C.setTranslationY(0.0f);
        rp0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i9, boolean z10) {
        cp0 cp0Var = this.x;
        rp0 rp0Var = cp0Var.D0;
        int i10 = rp0Var.m0;
        int i11 = rp0Var.l0;
        if (i10 != i11) {
            cp0Var.x0 = i10;
            cp0Var.y0 = i11;
            rp0Var.n0 = true;
            rp0Var.l0 = i10;
        } else {
            cp0Var.x0 = -1;
        }
        int i12 = cp0Var.v0;
        int i13 = cp0Var.w0;
        if (i12 != i13) {
            cp0Var.z0 = 0;
            cp0Var.A0 = 0;
            rp0Var.n0 = true;
            if (z10) {
                cp0Var.A0 = i12 - i13;
            } else {
                cp0Var.A0 = 0 - (i12 - i13);
            }
            rp0Var.l0 = z10 ? cp0Var.x0 : cp0Var.y0;
        } else {
            cp0Var.z0 = -1;
        }
        rp0Var.B.setTopGlowOffset((int) (rp0Var.p0 + rp0Var.l0));
        rp0Var.b.setTranslationY(rp0Var.p0 + rp0Var.l0);
        rp0Var.M.setTranslationY(rp0Var.p0 + rp0Var.l0);
        cp0Var.invalidate();
    }
}
