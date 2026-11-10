package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ xq0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                ys0 ys0Var = this.b;
                org.telegram.ui.ActionBar.r0 r0Var = ys0Var.p0;
                tr0[] tr0VarArr = ys0Var.m0;
                ys0Var.h1 = null;
                if (ys0Var.k1) {
                    tr0VarArr[1].setVisibility(8);
                    if (r0Var == null || ys0Var.I()) {
                        ys0Var.q0 = ys0Var.l0(0.0f);
                        ys0Var.M1(0.0f);
                    } else {
                        ys0Var.setSearchItemVisibility(ys0Var.I0() ? 8 : 4);
                        ys0Var.q0 = 0.0f;
                    }
                    ys0Var.I1(false);
                    ys0Var.z0 = 0;
                } else {
                    tr0 tr0Var = tr0VarArr[0];
                    tr0VarArr[0] = tr0VarArr[1];
                    tr0VarArr[1] = tr0Var;
                    tr0Var.setVisibility(8);
                    if (r0Var != null && ys0Var.z0 == 2) {
                        ys0Var.setSearchItemVisibility(ys0Var.I0() ? 8 : 4);
                    }
                    ys0Var.z0 = 0;
                    ys0Var.l1(1.0f, tr0VarArr[0].E);
                    ys0Var.Y0();
                    ys0Var.u1();
                }
                ys0Var.i1 = false;
                ys0Var.A1 = false;
                ys0Var.z1 = false;
                ys0Var.setHeaderEnabled(true);
                ys0Var.K0.setEnabled(true);
                break;
        }
    }
}
