package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jq0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ kq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(kq0 kq0Var, kq0 kq0Var2) {
        super(kq0Var2);
        this.x = kq0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        zq0 zq0Var = this.x.H0;
        if (zq0Var.isDismissed() || !zq0Var.Y) {
            return false;
        }
        return !zq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        kq0 kq0Var = this.x;
        zq0 zq0Var = kq0Var.H0;
        int i10 = zq0.W0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) zq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != zq0Var.h && childAt != zq0Var.v && childAt != zq0Var.S[1] && childAt != zq0Var.x && childAt != zq0Var.c && childAt != zq0Var.c0 && childAt != zq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        aq0 aq0Var = zq0Var.F;
        zq0Var.t0 = f7;
        int i12 = kq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            zq0Var.p0 = (int) ((kq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            aq0Var.setTranslationY(f12);
            if (z10) {
                zq0Var.G.setTranslationY(f12);
            } else {
                zq0Var.G.setTranslationY(f12 + zq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = kq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                zq0Var.p0 = (int) ((kq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    aq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    aq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        zq0Var.F.setTopGlowOffset((int) (zq0Var.p0 + zq0Var.t0));
        zq0Var.b.setTranslationY(zq0Var.p0 + zq0Var.t0);
        zq0Var.Q.setTranslationY(zq0Var.p0 + zq0Var.t0);
        zq0Var.c.invalidate();
        zq0Var.setCurrentPanTranslationY(zq0Var.t0);
        zq0Var.V0();
        kq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        zq0 zq0Var = this.x.H0;
        eq0 eq0Var = zq0Var.d;
        if (eq0Var == null || !eq0Var.m()) {
            int i10 = zq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        zq0Var.r0 = false;
        int i11 = zq0Var.p0;
        zq0Var.q0 = i11;
        zq0Var.F.setTopGlowOffset(i11);
        zq0Var.b.setTranslationY(zq0Var.p0);
        zq0Var.Q.setTranslationY(zq0Var.p0);
        zq0Var.F.setTranslationY(0.0f);
        zq0Var.G.setTranslationY(0.0f);
        zq0Var.V0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        kq0 kq0Var = this.x;
        zq0 zq0Var = kq0Var.H0;
        int i11 = zq0Var.q0;
        int i12 = zq0Var.p0;
        if (i11 != i12) {
            kq0Var.B0 = i11;
            kq0Var.C0 = i12;
            zq0Var.r0 = true;
            zq0Var.p0 = i11;
        } else {
            kq0Var.B0 = -1;
        }
        int i13 = kq0Var.z0;
        int i14 = kq0Var.A0;
        if (i13 != i14) {
            kq0Var.D0 = 0;
            kq0Var.E0 = 0;
            zq0Var.r0 = true;
            if (z10) {
                kq0Var.E0 = i13 - i14;
            } else {
                kq0Var.E0 = 0 - (i13 - i14);
            }
            zq0Var.p0 = z10 ? kq0Var.B0 : kq0Var.C0;
        } else {
            kq0Var.D0 = -1;
        }
        zq0Var.F.setTopGlowOffset((int) (zq0Var.t0 + zq0Var.p0));
        zq0Var.b.setTranslationY(zq0Var.t0 + zq0Var.p0);
        zq0Var.Q.setTranslationY(zq0Var.t0 + zq0Var.p0);
        kq0Var.invalidate();
    }
}
