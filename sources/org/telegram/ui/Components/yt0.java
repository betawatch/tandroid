package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ yt0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                bw0 bw0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = bw0Var.p0;
                uu0[] uu0VarArr = bw0Var.m0;
                bw0Var.h1 = null;
                if (bw0Var.k1) {
                    uu0VarArr[1].setVisibility(8);
                    if (w0Var == null || bw0Var.G()) {
                        bw0Var.q0 = bw0Var.i0(0.0f);
                        bw0Var.G1(0.0f);
                    } else {
                        bw0Var.setSearchItemVisibility(bw0Var.D0() ? 8 : 4);
                        bw0Var.q0 = 0.0f;
                    }
                    bw0Var.C1(false);
                    bw0Var.z0 = 0;
                } else {
                    uu0 uu0Var = uu0VarArr[0];
                    uu0VarArr[0] = uu0VarArr[1];
                    uu0VarArr[1] = uu0Var;
                    uu0Var.setVisibility(8);
                    if (w0Var != null && bw0Var.z0 == 2) {
                        bw0Var.setSearchItemVisibility(bw0Var.D0() ? 8 : 4);
                    }
                    bw0Var.z0 = 0;
                    bw0Var.f1(1.0f, uu0VarArr[0].E);
                    bw0Var.S0();
                    bw0Var.o1();
                }
                bw0Var.i1 = false;
                bw0Var.A1 = false;
                bw0Var.z1 = false;
                bw0Var.setHeaderEnabled(true);
                bw0Var.K0.setEnabled(true);
                break;
        }
    }
}
