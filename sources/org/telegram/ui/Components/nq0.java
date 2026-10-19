package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class nq0 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ oq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(oq0 oq0Var, oq0 oq0Var2) {
        super(oq0Var2);
        this.x = oq0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        er0 er0Var = this.x.H0;
        if (er0Var.isDismissed() || !er0Var.Z) {
            return false;
        }
        return !er0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        oq0 oq0Var = this.x;
        er0 er0Var = oq0Var.H0;
        int i10 = er0.b1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) er0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != er0Var.h && childAt != er0Var.w && childAt != er0Var.T[1] && childAt != er0Var.y && childAt != er0Var.c && childAt != er0Var.d0 && childAt != er0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        gq0 gq0Var = er0Var.G;
        er0Var.u0 = f7;
        int i12 = oq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            er0Var.q0 = (int) ((oq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            gq0Var.setTranslationY(f12);
            if (z10) {
                er0Var.H.setTranslationY(f12);
            } else {
                er0Var.H.setTranslationY(f12 + er0Var.G.getPaddingTop());
            }
        } else {
            int i13 = oq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                er0Var.q0 = (int) ((oq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    gq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    gq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        er0Var.G.setTopGlowOffset((int) (er0Var.q0 + er0Var.u0));
        er0Var.b.setTranslationY(er0Var.q0 + er0Var.u0);
        er0Var.R.setTranslationY(er0Var.q0 + er0Var.u0);
        er0Var.c.invalidate();
        er0Var.setCurrentPanTranslationY(er0Var.u0);
        er0Var.a1();
        oq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        er0 er0Var = this.x.H0;
        iq0 iq0Var = er0Var.d;
        if (iq0Var == null || !iq0Var.m()) {
            int i10 = er0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        er0Var.s0 = false;
        int i11 = er0Var.q0;
        er0Var.r0 = i11;
        er0Var.G.setTopGlowOffset(i11);
        er0Var.b.setTranslationY(er0Var.q0);
        er0Var.R.setTranslationY(er0Var.q0);
        er0Var.G.setTranslationY(0.0f);
        er0Var.H.setTranslationY(0.0f);
        er0Var.a1();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        oq0 oq0Var = this.x;
        er0 er0Var = oq0Var.H0;
        int i11 = er0Var.r0;
        int i12 = er0Var.q0;
        if (i11 != i12) {
            oq0Var.B0 = i11;
            oq0Var.C0 = i12;
            er0Var.s0 = true;
            er0Var.q0 = i11;
        } else {
            oq0Var.B0 = -1;
        }
        int i13 = oq0Var.z0;
        int i14 = oq0Var.A0;
        if (i13 != i14) {
            oq0Var.D0 = 0;
            oq0Var.E0 = 0;
            er0Var.s0 = true;
            if (z10) {
                oq0Var.E0 = i13 - i14;
            } else {
                oq0Var.E0 = 0 - (i13 - i14);
            }
            er0Var.q0 = z10 ? oq0Var.B0 : oq0Var.C0;
        } else {
            oq0Var.D0 = -1;
        }
        er0Var.G.setTopGlowOffset((int) (er0Var.u0 + er0Var.q0));
        er0Var.b.setTranslationY(er0Var.u0 + er0Var.q0);
        er0Var.R.setTranslationY(er0Var.u0 + er0Var.q0);
        oq0Var.invalidate();
    }
}
