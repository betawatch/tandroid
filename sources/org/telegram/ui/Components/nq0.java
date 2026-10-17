package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        dr0 dr0Var = this.x.H0;
        if (dr0Var.isDismissed() || !dr0Var.Y) {
            return false;
        }
        return !dr0Var.d.m();
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
        dr0 dr0Var = oq0Var.H0;
        int i10 = dr0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) dr0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != dr0Var.h && childAt != dr0Var.v && childAt != dr0Var.S[1] && childAt != dr0Var.x && childAt != dr0Var.c && childAt != dr0Var.c0 && childAt != dr0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        fq0 fq0Var = dr0Var.F;
        dr0Var.t0 = f7;
        int i12 = oq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            dr0Var.p0 = (int) ((oq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            fq0Var.setTranslationY(f12);
            if (z10) {
                dr0Var.G.setTranslationY(f12);
            } else {
                dr0Var.G.setTranslationY(f12 + dr0Var.F.getPaddingTop());
            }
        } else {
            int i13 = oq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                dr0Var.p0 = (int) ((oq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    fq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    fq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        dr0Var.F.setTopGlowOffset((int) (dr0Var.p0 + dr0Var.t0));
        dr0Var.b.setTranslationY(dr0Var.p0 + dr0Var.t0);
        dr0Var.Q.setTranslationY(dr0Var.p0 + dr0Var.t0);
        dr0Var.c.invalidate();
        dr0Var.setCurrentPanTranslationY(dr0Var.t0);
        dr0Var.Z0();
        oq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        dr0 dr0Var = this.x.H0;
        iq0 iq0Var = dr0Var.d;
        if (iq0Var == null || !iq0Var.m()) {
            int i10 = dr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        dr0Var.r0 = false;
        int i11 = dr0Var.p0;
        dr0Var.q0 = i11;
        dr0Var.F.setTopGlowOffset(i11);
        dr0Var.b.setTranslationY(dr0Var.p0);
        dr0Var.Q.setTranslationY(dr0Var.p0);
        dr0Var.F.setTranslationY(0.0f);
        dr0Var.G.setTranslationY(0.0f);
        dr0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        oq0 oq0Var = this.x;
        dr0 dr0Var = oq0Var.H0;
        int i11 = dr0Var.q0;
        int i12 = dr0Var.p0;
        if (i11 != i12) {
            oq0Var.B0 = i11;
            oq0Var.C0 = i12;
            dr0Var.r0 = true;
            dr0Var.p0 = i11;
        } else {
            oq0Var.B0 = -1;
        }
        int i13 = oq0Var.z0;
        int i14 = oq0Var.A0;
        if (i13 != i14) {
            oq0Var.D0 = 0;
            oq0Var.E0 = 0;
            dr0Var.r0 = true;
            if (z10) {
                oq0Var.E0 = i13 - i14;
            } else {
                oq0Var.E0 = 0 - (i13 - i14);
            }
            dr0Var.p0 = z10 ? oq0Var.B0 : oq0Var.C0;
        } else {
            oq0Var.D0 = -1;
        }
        dr0Var.F.setTopGlowOffset((int) (dr0Var.t0 + dr0Var.p0));
        dr0Var.b.setTranslationY(dr0Var.t0 + dr0Var.p0);
        dr0Var.Q.setTranslationY(dr0Var.t0 + dr0Var.p0);
        oq0Var.invalidate();
    }
}
