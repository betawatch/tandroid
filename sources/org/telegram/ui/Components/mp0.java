package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mp0 extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ np0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(np0 np0Var, np0 np0Var2) {
        super(np0Var2);
        this.x = np0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        dq0 dq0Var = this.x.D0;
        if (dq0Var.isDismissed() || !dq0Var.U) {
            return false;
        }
        return !dq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f9, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        np0 np0Var = this.x;
        dq0 dq0Var = np0Var.D0;
        int i10 = dq0.W0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != dq0Var.h && childAt != dq0Var.v && childAt != dq0Var.O[1] && childAt != dq0Var.x && childAt != dq0Var.c && childAt != dq0Var.Y && childAt != dq0Var.f) {
                childAt.setTranslationY(f9);
            }
        }
        dp0 dp0Var = dq0Var.B;
        dq0Var.p0 = f9;
        int i12 = np0Var.x0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            dq0Var.l0 = (int) ((np0Var.y0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f9;
            dp0Var.setTranslationY(f12);
            if (z10) {
                dq0Var.C.setTranslationY(f12);
            } else {
                dq0Var.C.setTranslationY(f12 + dq0Var.B.getPaddingTop());
            }
        } else {
            int i13 = np0Var.z0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                dq0Var.l0 = (int) ((np0Var.A0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    dp0Var.setTranslationY(f9 - ((i13 - r6) * f10));
                } else {
                    dp0Var.setTranslationY(((r6 - i13) * f13) + f9);
                }
            }
        }
        dq0Var.B.setTopGlowOffset((int) (dq0Var.l0 + dq0Var.p0));
        dq0Var.b.setTranslationY(dq0Var.l0 + dq0Var.p0);
        dq0Var.M.setTranslationY(dq0Var.l0 + dq0Var.p0);
        dq0Var.c.invalidate();
        dq0Var.setCurrentPanTranslationY(dq0Var.p0);
        dq0Var.Y0();
        np0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        dq0 dq0Var = this.x.D0;
        gp0 gp0Var = dq0Var.d;
        if (gp0Var == null || !gp0Var.m()) {
            int i10 = dq0Var.J0;
            AndroidUtilities.dp(20.0f);
        }
        dq0Var.n0 = false;
        int i11 = dq0Var.l0;
        dq0Var.m0 = i11;
        dq0Var.B.setTopGlowOffset(i11);
        dq0Var.b.setTranslationY(dq0Var.l0);
        dq0Var.M.setTranslationY(dq0Var.l0);
        dq0Var.B.setTranslationY(0.0f);
        dq0Var.C.setTranslationY(0.0f);
        dq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        np0 np0Var = this.x;
        dq0 dq0Var = np0Var.D0;
        int i11 = dq0Var.m0;
        int i12 = dq0Var.l0;
        if (i11 != i12) {
            np0Var.x0 = i11;
            np0Var.y0 = i12;
            dq0Var.n0 = true;
            dq0Var.l0 = i11;
        } else {
            np0Var.x0 = -1;
        }
        int i13 = np0Var.v0;
        int i14 = np0Var.w0;
        if (i13 != i14) {
            np0Var.z0 = 0;
            np0Var.A0 = 0;
            dq0Var.n0 = true;
            if (z10) {
                np0Var.A0 = i13 - i14;
            } else {
                np0Var.A0 = 0 - (i13 - i14);
            }
            dq0Var.l0 = z10 ? np0Var.x0 : np0Var.y0;
        } else {
            np0Var.z0 = -1;
        }
        dq0Var.B.setTopGlowOffset((int) (dq0Var.p0 + dq0Var.l0));
        dq0Var.b.setTranslationY(dq0Var.p0 + dq0Var.l0);
        dq0Var.M.setTranslationY(dq0Var.p0 + dq0Var.l0);
        np0Var.invalidate();
    }
}
