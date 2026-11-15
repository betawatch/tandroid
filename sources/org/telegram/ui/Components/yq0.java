package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ yq0(ys0 ys0Var, int i7) {
        this.a = i7;
        this.b = ys0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O0 = null;
                break;
            default:
                ys0 ys0Var = this.b;
                org.telegram.ui.ActionBar.q0 q0Var = ys0Var.q0;
                tr0[] tr0VarArr = ys0Var.n0;
                ys0Var.i1 = null;
                if (ys0Var.l1) {
                    tr0VarArr[1].setVisibility(8);
                    if (q0Var == null || ys0Var.I()) {
                        ys0Var.r0 = ys0Var.l0(0.0f);
                        ys0Var.M1(0.0f);
                    } else {
                        ys0Var.setSearchItemVisibility(ys0Var.I0() ? 8 : 4);
                        ys0Var.r0 = 0.0f;
                    }
                    ys0Var.I1(false);
                    ys0Var.A0 = 0;
                } else {
                    tr0 tr0Var = tr0VarArr[0];
                    tr0VarArr[0] = tr0VarArr[1];
                    tr0VarArr[1] = tr0Var;
                    tr0Var.setVisibility(8);
                    if (q0Var != null && ys0Var.A0 == 2) {
                        ys0Var.setSearchItemVisibility(ys0Var.I0() ? 8 : 4);
                    }
                    ys0Var.A0 = 0;
                    ys0Var.l1(1.0f, tr0VarArr[0].F);
                    ys0Var.Y0();
                    ys0Var.u1();
                }
                ys0Var.j1 = false;
                ys0Var.B1 = false;
                ys0Var.A1 = false;
                ys0Var.setHeaderEnabled(true);
                ys0Var.L0.setEnabled(true);
                break;
        }
    }
}
