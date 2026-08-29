package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class is0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu0 b;

    public /* synthetic */ is0(qu0 qu0Var, int i10) {
        this.a = i10;
        this.b = qu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.H0 = null;
                break;
            default:
                qu0 qu0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = qu0Var.j0;
                it0[] it0VarArr = qu0Var.g0;
                qu0Var.b1 = null;
                if (qu0Var.e1) {
                    it0VarArr[1].setVisibility(8);
                    if (w0Var == null || qu0Var.D()) {
                        qu0Var.k0 = qu0Var.b0(0.0f);
                        qu0Var.s1(0.0f);
                    } else {
                        w0Var.setVisibility(qu0Var.v0() ? 8 : 4);
                        qu0Var.k0 = 0.0f;
                    }
                    qu0Var.q1(false);
                    qu0Var.t0 = 0;
                } else {
                    it0 it0Var = it0VarArr[0];
                    it0VarArr[0] = it0VarArr[1];
                    it0VarArr[1] = it0Var;
                    it0Var.setVisibility(8);
                    if (w0Var != null && qu0Var.t0 == 2) {
                        w0Var.setVisibility(qu0Var.v0() ? 8 : 4);
                    }
                    qu0Var.t0 = 0;
                    qu0Var.Z0(1.0f, it0VarArr[0].B);
                    qu0Var.L0();
                    qu0Var.f1();
                }
                qu0Var.c1 = false;
                qu0Var.u1 = false;
                qu0Var.t1 = false;
                qu0Var.N0(false);
                qu0Var.C.setEnabled(true);
                qu0Var.E0.setEnabled(true);
                break;
        }
    }
}
