package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        ir0 ir0Var = this.x.H0;
        if (ir0Var.isDismissed() || !ir0Var.Y) {
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
        ir0 ir0Var = tq0Var.H0;
        int i10 = ir0.a1;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) ir0Var).containerView;
            View childAt = viewGroup2.getChildAt(i11);
            if (childAt != ir0Var.h && childAt != ir0Var.v && childAt != ir0Var.S[1] && childAt != ir0Var.x && childAt != ir0Var.c && childAt != ir0Var.c0 && childAt != ir0Var.f) {
                childAt.setTranslationY(f7);
            }
        }
        kq0 kq0Var = ir0Var.F;
        ir0Var.t0 = f7;
        int i12 = tq0Var.B0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            ir0Var.p0 = (int) ((tq0Var.C0 * f10) + (i12 * f11));
            float f12 = ((i12 - r6) * f11) + f7;
            kq0Var.setTranslationY(f12);
            if (z10) {
                ir0Var.G.setTranslationY(f12);
            } else {
                ir0Var.G.setTranslationY(f12 + ir0Var.F.getPaddingTop());
            }
        } else {
            int i13 = tq0Var.D0;
            if (i13 != -1) {
                float f13 = 1.0f - f10;
                ir0Var.p0 = (int) ((tq0Var.E0 * f10) + (i13 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    kq0Var.setTranslationY(f7 - ((i13 - r6) * f10));
                } else {
                    kq0Var.setTranslationY(((r6 - i13) * f13) + f7);
                }
            }
        }
        ir0Var.F.setTopGlowOffset((int) (ir0Var.p0 + ir0Var.t0));
        ir0Var.b.setTranslationY(ir0Var.p0 + ir0Var.t0);
        ir0Var.Q.setTranslationY(ir0Var.p0 + ir0Var.t0);
        ir0Var.c.invalidate();
        ir0Var.setCurrentPanTranslationY(ir0Var.t0);
        ir0Var.Z0();
        tq0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        ir0 ir0Var = this.x.H0;
        nq0 nq0Var = ir0Var.d;
        if (nq0Var == null || !nq0Var.m()) {
            int i10 = ir0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        ir0Var.r0 = false;
        int i11 = ir0Var.p0;
        ir0Var.q0 = i11;
        ir0Var.F.setTopGlowOffset(i11);
        ir0Var.b.setTranslationY(ir0Var.p0);
        ir0Var.Q.setTranslationY(ir0Var.p0);
        ir0Var.F.setTranslationY(0.0f);
        ir0Var.G.setTranslationY(0.0f);
        ir0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        tq0 tq0Var = this.x;
        ir0 ir0Var = tq0Var.H0;
        int i11 = ir0Var.q0;
        int i12 = ir0Var.p0;
        if (i11 != i12) {
            tq0Var.B0 = i11;
            tq0Var.C0 = i12;
            ir0Var.r0 = true;
            ir0Var.p0 = i11;
        } else {
            tq0Var.B0 = -1;
        }
        int i13 = tq0Var.z0;
        int i14 = tq0Var.A0;
        if (i13 != i14) {
            tq0Var.D0 = 0;
            tq0Var.E0 = 0;
            ir0Var.r0 = true;
            if (z10) {
                tq0Var.E0 = i13 - i14;
            } else {
                tq0Var.E0 = 0 - (i13 - i14);
            }
            ir0Var.p0 = z10 ? tq0Var.B0 : tq0Var.C0;
        } else {
            tq0Var.D0 = -1;
        }
        ir0Var.F.setTopGlowOffset((int) (ir0Var.t0 + ir0Var.p0));
        ir0Var.b.setTranslationY(ir0Var.t0 + ir0Var.p0);
        ir0Var.Q.setTranslationY(ir0Var.t0 + ir0Var.p0);
        tq0Var.invalidate();
    }
}
