package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class sq0 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ tq0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(tq0 tq0Var, tq0 tq0Var2) {
        super(tq0Var2);
        this.x = tq0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        ir0 ir0Var = this.x.G0;
        if (ir0Var.isDismissed() || !ir0Var.Z) {
            return false;
        }
        return !ir0Var.d.m();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    @Override // org.telegram.ui.ActionBar.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f7, float f10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        tq0 tq0Var = this.x;
        ir0 ir0Var = tq0Var.G0;
        int i10 = ir0.d1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) ir0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != ir0Var.h && childAt != ir0Var.w && childAt != ir0Var.T[1] && childAt != ir0Var.y && childAt != ir0Var.c && childAt != ir0Var.d0 && childAt != ir0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        lq0 lq0Var = ir0Var.G;
        ir0Var.u0 = f7;
        int i12 = tq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            ir0Var.q0 = (int) ((tq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            lq0Var.setTranslationY(f12);
            if (z10) {
                ir0Var.H.setTranslationY(f12);
            } else {
                ir0Var.H.setTranslationY(f12 + ir0Var.G.getPaddingTop());
            }
        } else {
            int i13 = tq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                ir0Var.q0 = (int) ((tq0Var.E0 * f10) + (i13 * f13));
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
        ir0Var.G.setTopGlowOffset((int) (ir0Var.q0 + ir0Var.u0));
        ir0Var.b.setTranslationY(ir0Var.q0 + ir0Var.u0);
        ir0Var.R.setTranslationY(ir0Var.q0 + ir0Var.u0);
        ir0Var.c.invalidate();
        ir0Var.setCurrentPanTranslationY(ir0Var.u0);
        ir0Var.e1();
        tq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        ir0 ir0Var = this.x.G0;
        nq0 nq0Var = ir0Var.d;
        if (nq0Var == null || !nq0Var.m()) {
            int i10 = ir0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        ir0Var.s0 = false;
        int i11 = ir0Var.q0;
        ir0Var.r0 = i11;
        ir0Var.G.setTopGlowOffset(i11);
        ir0Var.b.setTranslationY(ir0Var.q0);
        ir0Var.R.setTranslationY(ir0Var.q0);
        ir0Var.G.setTranslationY(0.0f);
        ir0Var.H.setTranslationY(0.0f);
        ir0Var.e1();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        tq0 tq0Var = this.x;
        ir0 ir0Var = tq0Var.G0;
        int i11 = ir0Var.r0;
        int i12 = ir0Var.q0;
        if (i11 != i12) {
            tq0Var.B0 = i11;
            tq0Var.C0 = i12;
            ir0Var.s0 = true;
            ir0Var.q0 = i11;
        } else {
            tq0Var.B0 = -1;
        }
        int i13 = tq0Var.z0;
        int i14 = tq0Var.A0;
        if (i13 != i14) {
            tq0Var.D0 = 0;
            tq0Var.E0 = 0;
            ir0Var.s0 = true;
            if (z10) {
                tq0Var.E0 = i13 - i14;
            } else {
                tq0Var.E0 = 0 - (i13 - i14);
            }
            ir0Var.q0 = z10 ? tq0Var.B0 : tq0Var.C0;
        } else {
            tq0Var.D0 = -1;
        }
        ir0Var.G.setTopGlowOffset((int) (ir0Var.u0 + ir0Var.q0));
        ir0Var.b.setTranslationY(ir0Var.u0 + ir0Var.q0);
        ir0Var.R.setTranslationY(ir0Var.u0 + ir0Var.q0);
        tq0Var.invalidate();
    }
}
