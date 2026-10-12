package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tq0 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ uq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(uq0 uq0Var, uq0 uq0Var2) {
        super(uq0Var2);
        this.x = uq0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        jr0 jr0Var = this.x.H0;
        if (jr0Var.isDismissed() || !jr0Var.Y) {
            return false;
        }
        return !jr0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        uq0 uq0Var = this.x;
        jr0 jr0Var = uq0Var.H0;
        int i10 = jr0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) jr0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != jr0Var.h && childAt != jr0Var.v && childAt != jr0Var.S[1] && childAt != jr0Var.x && childAt != jr0Var.c && childAt != jr0Var.c0 && childAt != jr0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        lq0 lq0Var = jr0Var.F;
        jr0Var.t0 = f7;
        int i12 = uq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            jr0Var.p0 = (int) ((uq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            lq0Var.setTranslationY(f12);
            if (z10) {
                jr0Var.G.setTranslationY(f12);
            } else {
                jr0Var.G.setTranslationY(f12 + jr0Var.F.getPaddingTop());
            }
        } else {
            int i13 = uq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                jr0Var.p0 = (int) ((uq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    lq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    lq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        jr0Var.F.setTopGlowOffset((int) (jr0Var.p0 + jr0Var.t0));
        jr0Var.b.setTranslationY(jr0Var.p0 + jr0Var.t0);
        jr0Var.Q.setTranslationY(jr0Var.p0 + jr0Var.t0);
        jr0Var.c.invalidate();
        jr0Var.setCurrentPanTranslationY(jr0Var.t0);
        jr0Var.Z0();
        uq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        jr0 jr0Var = this.x.H0;
        oq0 oq0Var = jr0Var.d;
        if (oq0Var == null || !oq0Var.m()) {
            int i10 = jr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        jr0Var.r0 = false;
        int i11 = jr0Var.p0;
        jr0Var.q0 = i11;
        jr0Var.F.setTopGlowOffset(i11);
        jr0Var.b.setTranslationY(jr0Var.p0);
        jr0Var.Q.setTranslationY(jr0Var.p0);
        jr0Var.F.setTranslationY(0.0f);
        jr0Var.G.setTranslationY(0.0f);
        jr0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        uq0 uq0Var = this.x;
        jr0 jr0Var = uq0Var.H0;
        int i11 = jr0Var.q0;
        int i12 = jr0Var.p0;
        if (i11 != i12) {
            uq0Var.B0 = i11;
            uq0Var.C0 = i12;
            jr0Var.r0 = true;
            jr0Var.p0 = i11;
        } else {
            uq0Var.B0 = -1;
        }
        int i13 = uq0Var.z0;
        int i14 = uq0Var.A0;
        if (i13 != i14) {
            uq0Var.D0 = 0;
            uq0Var.E0 = 0;
            jr0Var.r0 = true;
            if (z10) {
                uq0Var.E0 = i13 - i14;
            } else {
                uq0Var.E0 = 0 - (i13 - i14);
            }
            jr0Var.p0 = z10 ? uq0Var.B0 : uq0Var.C0;
        } else {
            uq0Var.D0 = -1;
        }
        jr0Var.F.setTopGlowOffset((int) (jr0Var.t0 + jr0Var.p0));
        jr0Var.b.setTranslationY(jr0Var.t0 + jr0Var.p0);
        jr0Var.Q.setTranslationY(jr0Var.t0 + jr0Var.p0);
        uq0Var.invalidate();
    }
}
