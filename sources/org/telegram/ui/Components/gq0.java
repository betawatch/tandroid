package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gq0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ hq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(hq0 hq0Var, hq0 hq0Var2) {
        super(hq0Var2);
        this.x = hq0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        wq0 wq0Var = this.x.H0;
        if (wq0Var.isDismissed() || !wq0Var.Y) {
            return false;
        }
        return !wq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        hq0 hq0Var = this.x;
        wq0 wq0Var = hq0Var.H0;
        int i10 = wq0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) wq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != wq0Var.h && childAt != wq0Var.v && childAt != wq0Var.S[1] && childAt != wq0Var.x && childAt != wq0Var.c && childAt != wq0Var.c0 && childAt != wq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        yp0 yp0Var = wq0Var.F;
        wq0Var.t0 = f7;
        int i12 = hq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            wq0Var.p0 = (int) ((hq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            yp0Var.setTranslationY(f12);
            if (z10) {
                wq0Var.G.setTranslationY(f12);
            } else {
                wq0Var.G.setTranslationY(f12 + wq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = hq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                wq0Var.p0 = (int) ((hq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    yp0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    yp0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        wq0Var.F.setTopGlowOffset((int) (wq0Var.p0 + wq0Var.t0));
        wq0Var.b.setTranslationY(wq0Var.p0 + wq0Var.t0);
        wq0Var.Q.setTranslationY(wq0Var.p0 + wq0Var.t0);
        wq0Var.c.invalidate();
        wq0Var.setCurrentPanTranslationY(wq0Var.t0);
        wq0Var.Y0();
        hq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        wq0 wq0Var = this.x.H0;
        bq0 bq0Var = wq0Var.d;
        if (bq0Var == null || !bq0Var.m()) {
            int i10 = wq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        wq0Var.r0 = false;
        int i11 = wq0Var.p0;
        wq0Var.q0 = i11;
        wq0Var.F.setTopGlowOffset(i11);
        wq0Var.b.setTranslationY(wq0Var.p0);
        wq0Var.Q.setTranslationY(wq0Var.p0);
        wq0Var.F.setTranslationY(0.0f);
        wq0Var.G.setTranslationY(0.0f);
        wq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        hq0 hq0Var = this.x;
        wq0 wq0Var = hq0Var.H0;
        int i11 = wq0Var.q0;
        int i12 = wq0Var.p0;
        if (i11 != i12) {
            hq0Var.B0 = i11;
            hq0Var.C0 = i12;
            wq0Var.r0 = true;
            wq0Var.p0 = i11;
        } else {
            hq0Var.B0 = -1;
        }
        int i13 = hq0Var.z0;
        int i14 = hq0Var.A0;
        if (i13 != i14) {
            hq0Var.D0 = 0;
            hq0Var.E0 = 0;
            wq0Var.r0 = true;
            if (z10) {
                hq0Var.E0 = i13 - i14;
            } else {
                hq0Var.E0 = 0 - (i13 - i14);
            }
            wq0Var.p0 = z10 ? hq0Var.B0 : hq0Var.C0;
        } else {
            hq0Var.D0 = -1;
        }
        wq0Var.F.setTopGlowOffset((int) (wq0Var.t0 + wq0Var.p0));
        wq0Var.b.setTranslationY(wq0Var.t0 + wq0Var.p0);
        wq0Var.Q.setTranslationY(wq0Var.t0 + wq0Var.p0);
        hq0Var.invalidate();
    }
}
