package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ sp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp0(sp0 sp0Var, sp0 sp0Var2) {
        super(sp0Var2);
        this.x = sp0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        hq0 hq0Var = this.x.H0;
        if (hq0Var.isDismissed() || !hq0Var.Y) {
            return false;
        }
        return !hq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        sp0 sp0Var = this.x;
        hq0 hq0Var = sp0Var.H0;
        int i10 = hq0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != hq0Var.h && childAt != hq0Var.v && childAt != hq0Var.S[1] && childAt != hq0Var.x && childAt != hq0Var.c && childAt != hq0Var.c0 && childAt != hq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        jp0 jp0Var = hq0Var.F;
        hq0Var.t0 = f7;
        int i12 = sp0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            hq0Var.p0 = (int) ((sp0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            jp0Var.setTranslationY(f12);
            if (z10) {
                hq0Var.G.setTranslationY(f12);
            } else {
                hq0Var.G.setTranslationY(f12 + hq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = sp0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                hq0Var.p0 = (int) ((sp0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    jp0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    jp0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        hq0Var.F.setTopGlowOffset((int) (hq0Var.p0 + hq0Var.t0));
        hq0Var.b.setTranslationY(hq0Var.p0 + hq0Var.t0);
        hq0Var.Q.setTranslationY(hq0Var.p0 + hq0Var.t0);
        hq0Var.c.invalidate();
        hq0Var.setCurrentPanTranslationY(hq0Var.t0);
        hq0Var.Y0();
        sp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        hq0 hq0Var = this.x.H0;
        mp0 mp0Var = hq0Var.d;
        if (mp0Var == null || !mp0Var.m()) {
            int i10 = hq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        hq0Var.r0 = false;
        int i11 = hq0Var.p0;
        hq0Var.q0 = i11;
        hq0Var.F.setTopGlowOffset(i11);
        hq0Var.b.setTranslationY(hq0Var.p0);
        hq0Var.Q.setTranslationY(hq0Var.p0);
        hq0Var.F.setTranslationY(0.0f);
        hq0Var.G.setTranslationY(0.0f);
        hq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        sp0 sp0Var = this.x;
        hq0 hq0Var = sp0Var.H0;
        int i11 = hq0Var.q0;
        int i12 = hq0Var.p0;
        if (i11 != i12) {
            sp0Var.B0 = i11;
            sp0Var.C0 = i12;
            hq0Var.r0 = true;
            hq0Var.p0 = i11;
        } else {
            sp0Var.B0 = -1;
        }
        int i13 = sp0Var.z0;
        int i14 = sp0Var.A0;
        if (i13 != i14) {
            sp0Var.D0 = 0;
            sp0Var.E0 = 0;
            hq0Var.r0 = true;
            if (z10) {
                sp0Var.E0 = i13 - i14;
            } else {
                sp0Var.E0 = 0 - (i13 - i14);
            }
            hq0Var.p0 = z10 ? sp0Var.B0 : sp0Var.C0;
        } else {
            sp0Var.D0 = -1;
        }
        hq0Var.F.setTopGlowOffset((int) (hq0Var.t0 + hq0Var.p0));
        hq0Var.b.setTranslationY(hq0Var.t0 + hq0Var.p0);
        hq0Var.Q.setTranslationY(hq0Var.t0 + hq0Var.p0);
        sp0Var.invalidate();
    }
}
