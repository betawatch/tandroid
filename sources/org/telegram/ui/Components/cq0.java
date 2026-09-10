package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cq0 extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ dq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(dq0 dq0Var, dq0 dq0Var2) {
        super(dq0Var2);
        this.x = dq0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        sq0 sq0Var = this.x.H0;
        if (sq0Var.isDismissed() || !sq0Var.Y) {
            return false;
        }
        return !sq0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        dq0 dq0Var = this.x;
        sq0 sq0Var = dq0Var.H0;
        int i10 = sq0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) sq0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != sq0Var.h && childAt != sq0Var.v && childAt != sq0Var.S[1] && childAt != sq0Var.x && childAt != sq0Var.c && childAt != sq0Var.c0 && childAt != sq0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        tp0 tp0Var = sq0Var.F;
        sq0Var.t0 = f7;
        int i12 = dq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            sq0Var.p0 = (int) ((dq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            tp0Var.setTranslationY(f12);
            if (z10) {
                sq0Var.G.setTranslationY(f12);
            } else {
                sq0Var.G.setTranslationY(f12 + sq0Var.F.getPaddingTop());
            }
        } else {
            int i13 = dq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                sq0Var.p0 = (int) ((dq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    tp0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    tp0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        sq0Var.F.setTopGlowOffset((int) (sq0Var.p0 + sq0Var.t0));
        sq0Var.b.setTranslationY(sq0Var.p0 + sq0Var.t0);
        sq0Var.Q.setTranslationY(sq0Var.p0 + sq0Var.t0);
        sq0Var.c.invalidate();
        sq0Var.setCurrentPanTranslationY(sq0Var.t0);
        sq0Var.Y0();
        dq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        sq0 sq0Var = this.x.H0;
        wp0 wp0Var = sq0Var.d;
        if (wp0Var == null || !wp0Var.m()) {
            int i10 = sq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        sq0Var.r0 = false;
        int i11 = sq0Var.p0;
        sq0Var.q0 = i11;
        sq0Var.F.setTopGlowOffset(i11);
        sq0Var.b.setTranslationY(sq0Var.p0);
        sq0Var.Q.setTranslationY(sq0Var.p0);
        sq0Var.F.setTranslationY(0.0f);
        sq0Var.G.setTranslationY(0.0f);
        sq0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z10) {
        dq0 dq0Var = this.x;
        sq0 sq0Var = dq0Var.H0;
        int i11 = sq0Var.q0;
        int i12 = sq0Var.p0;
        if (i11 != i12) {
            dq0Var.B0 = i11;
            dq0Var.C0 = i12;
            sq0Var.r0 = true;
            sq0Var.p0 = i11;
        } else {
            dq0Var.B0 = -1;
        }
        int i13 = dq0Var.z0;
        int i14 = dq0Var.A0;
        if (i13 != i14) {
            dq0Var.D0 = 0;
            dq0Var.E0 = 0;
            sq0Var.r0 = true;
            if (z10) {
                dq0Var.E0 = i13 - i14;
            } else {
                dq0Var.E0 = 0 - (i13 - i14);
            }
            sq0Var.p0 = z10 ? dq0Var.B0 : dq0Var.C0;
        } else {
            dq0Var.D0 = -1;
        }
        sq0Var.F.setTopGlowOffset((int) (sq0Var.t0 + sq0Var.p0));
        sq0Var.b.setTranslationY(sq0Var.t0 + sq0Var.p0);
        sq0Var.Q.setTranslationY(sq0Var.t0 + sq0Var.p0);
        dq0Var.invalidate();
    }
}
