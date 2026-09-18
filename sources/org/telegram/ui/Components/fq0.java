package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class fq0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ gq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(gq0 gq0Var, gq0 gq0Var2) {
        super(gq0Var2);
        this.x = gq0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        vq0 vq0Var = this.x.H0;
        if (vq0Var.isDismissed() || !vq0Var.Y) {
            return false;
        }
        return !vq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        gq0 gq0Var = this.x;
        vq0 vq0Var = gq0Var.H0;
        int i10 = vq0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) vq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != vq0Var.h && childAt != vq0Var.v && childAt != vq0Var.S[1] && childAt != vq0Var.x && childAt != vq0Var.c && childAt != vq0Var.c0 && childAt != vq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        xp0 xp0Var = vq0Var.F;
        vq0Var.t0 = f7;
        int i12 = gq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            vq0Var.p0 = (int) ((gq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            xp0Var.setTranslationY(f12);
            if (z10) {
                vq0Var.G.setTranslationY(f12);
            } else {
                vq0Var.G.setTranslationY(f12 + vq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = gq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                vq0Var.p0 = (int) ((gq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    xp0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    xp0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        vq0Var.F.setTopGlowOffset((int) (vq0Var.p0 + vq0Var.t0));
        vq0Var.b.setTranslationY(vq0Var.p0 + vq0Var.t0);
        vq0Var.Q.setTranslationY(vq0Var.p0 + vq0Var.t0);
        vq0Var.c.invalidate();
        vq0Var.setCurrentPanTranslationY(vq0Var.t0);
        vq0Var.Y0();
        gq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        vq0 vq0Var = this.x.H0;
        aq0 aq0Var = vq0Var.d;
        if (aq0Var == null || !aq0Var.m()) {
            int i10 = vq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        vq0Var.r0 = false;
        int i11 = vq0Var.p0;
        vq0Var.q0 = i11;
        vq0Var.F.setTopGlowOffset(i11);
        vq0Var.b.setTranslationY(vq0Var.p0);
        vq0Var.Q.setTranslationY(vq0Var.p0);
        vq0Var.F.setTranslationY(0.0f);
        vq0Var.G.setTranslationY(0.0f);
        vq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        gq0 gq0Var = this.x;
        vq0 vq0Var = gq0Var.H0;
        int i11 = vq0Var.q0;
        int i12 = vq0Var.p0;
        if (i11 != i12) {
            gq0Var.B0 = i11;
            gq0Var.C0 = i12;
            vq0Var.r0 = true;
            vq0Var.p0 = i11;
        } else {
            gq0Var.B0 = -1;
        }
        int i13 = gq0Var.z0;
        int i14 = gq0Var.A0;
        if (i13 != i14) {
            gq0Var.D0 = 0;
            gq0Var.E0 = 0;
            vq0Var.r0 = true;
            if (z10) {
                gq0Var.E0 = i13 - i14;
            } else {
                gq0Var.E0 = 0 - (i13 - i14);
            }
            vq0Var.p0 = z10 ? gq0Var.B0 : gq0Var.C0;
        } else {
            gq0Var.D0 = -1;
        }
        vq0Var.F.setTopGlowOffset((int) (vq0Var.t0 + vq0Var.p0));
        vq0Var.b.setTranslationY(vq0Var.t0 + vq0Var.p0);
        vq0Var.Q.setTranslationY(vq0Var.t0 + vq0Var.p0);
        gq0Var.invalidate();
    }
}
