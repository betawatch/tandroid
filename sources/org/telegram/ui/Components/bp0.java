package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bp0 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ cp0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(cp0 cp0Var, cp0 cp0Var2) {
        super(cp0Var2);
        this.x = cp0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        sp0 sp0Var = this.x.D0;
        if (sp0Var.isDismissed() || !sp0Var.U) {
            return false;
        }
        return !sp0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f10, float f11, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        cp0 cp0Var = this.x;
        sp0 sp0Var = cp0Var.D0;
        int i10 = sp0.W0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) sp0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != sp0Var.h && childAt != sp0Var.v && childAt != sp0Var.O[1] && childAt != sp0Var.x && childAt != sp0Var.c && childAt != sp0Var.Y && childAt != sp0Var.f) {
                childAt.setTranslationY(f10);
            }
        }
        so0 so0Var = sp0Var.B;
        sp0Var.p0 = f10;
        int i12 = cp0Var.x0;
        if (i12 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            sp0Var.l0 = (int) ((cp0Var.y0 * f11) + (i12 * f12));
            float f13 = ((i12 - r6) * f12) + f10;
            so0Var.setTranslationY(f13);
            if (z10) {
                sp0Var.C.setTranslationY(f13);
            } else {
                sp0Var.C.setTranslationY(f13 + sp0Var.B.getPaddingTop());
            }
        } else {
            int i13 = cp0Var.z0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                sp0Var.l0 = (int) ((cp0Var.A0 * f11) + (i13 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    so0Var.setTranslationY(f10 - ((i13 - r6) * f11));
                } else {
                    so0Var.setTranslationY(((r6 - i13) * f14) + f10);
                }
            }
        }
        sp0Var.B.setTopGlowOffset((int) (sp0Var.l0 + sp0Var.p0));
        sp0Var.b.setTranslationY(sp0Var.l0 + sp0Var.p0);
        sp0Var.M.setTranslationY(sp0Var.l0 + sp0Var.p0);
        sp0Var.c.invalidate();
        sp0Var.setCurrentPanTranslationY(sp0Var.p0);
        sp0Var.Y0();
        cp0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        sp0 sp0Var = this.x.D0;
        vo0 vo0Var = sp0Var.d;
        if (vo0Var == null || !vo0Var.m()) {
            int i10 = sp0Var.J0;
            AndroidUtilities.dp(20.0f);
        }
        sp0Var.n0 = false;
        int i11 = sp0Var.l0;
        sp0Var.m0 = i11;
        sp0Var.B.setTopGlowOffset(i11);
        sp0Var.b.setTranslationY(sp0Var.l0);
        sp0Var.M.setTranslationY(sp0Var.l0);
        sp0Var.B.setTranslationY(0.0f);
        sp0Var.C.setTranslationY(0.0f);
        sp0Var.Y0();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        cp0 cp0Var = this.x;
        sp0 sp0Var = cp0Var.D0;
        int i11 = sp0Var.m0;
        int i12 = sp0Var.l0;
        if (i11 != i12) {
            cp0Var.x0 = i11;
            cp0Var.y0 = i12;
            sp0Var.n0 = true;
            sp0Var.l0 = i11;
        } else {
            cp0Var.x0 = -1;
        }
        int i13 = cp0Var.v0;
        int i14 = cp0Var.w0;
        if (i13 != i14) {
            cp0Var.z0 = 0;
            cp0Var.A0 = 0;
            sp0Var.n0 = true;
            if (z10) {
                cp0Var.A0 = i13 - i14;
            } else {
                cp0Var.A0 = 0 - (i13 - i14);
            }
            sp0Var.l0 = z10 ? cp0Var.x0 : cp0Var.y0;
        } else {
            cp0Var.z0 = -1;
        }
        sp0Var.B.setTopGlowOffset((int) (sp0Var.p0 + sp0Var.l0));
        sp0Var.b.setTranslationY(sp0Var.p0 + sp0Var.l0);
        sp0Var.M.setTranslationY(sp0Var.p0 + sp0Var.l0);
        cp0Var.invalidate();
    }
}
