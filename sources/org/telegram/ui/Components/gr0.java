package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;

    public /* synthetic */ gr0(gt0 gt0Var, int i7) {
        this.a = i7;
        this.b = gt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O0 = null;
                break;
            default:
                gt0 gt0Var = this.b;
                org.telegram.ui.ActionBar.r0 r0Var = gt0Var.q0;
                bs0[] bs0VarArr = gt0Var.n0;
                gt0Var.i1 = null;
                if (gt0Var.l1) {
                    bs0VarArr[1].setVisibility(8);
                    if (r0Var == null || gt0Var.I()) {
                        gt0Var.r0 = gt0Var.l0(0.0f);
                        gt0Var.M1(0.0f);
                    } else {
                        gt0Var.setSearchItemVisibility(gt0Var.I0() ? 8 : 4);
                        gt0Var.r0 = 0.0f;
                    }
                    gt0Var.I1(false);
                    gt0Var.A0 = 0;
                } else {
                    bs0 bs0Var = bs0VarArr[0];
                    bs0VarArr[0] = bs0VarArr[1];
                    bs0VarArr[1] = bs0Var;
                    bs0Var.setVisibility(8);
                    if (r0Var != null && gt0Var.A0 == 2) {
                        gt0Var.setSearchItemVisibility(gt0Var.I0() ? 8 : 4);
                    }
                    gt0Var.A0 = 0;
                    gt0Var.l1(1.0f, bs0VarArr[0].F);
                    gt0Var.Y0();
                    gt0Var.u1();
                }
                gt0Var.j1 = false;
                gt0Var.B1 = false;
                gt0Var.A1 = false;
                gt0Var.setHeaderEnabled(true);
                gt0Var.L0.setEnabled(true);
                break;
        }
    }
}
