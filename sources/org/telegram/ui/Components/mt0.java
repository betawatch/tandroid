package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv0 b;

    public /* synthetic */ mt0(tv0 tv0Var, int i10) {
        this.a = i10;
        this.b = tv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                tv0 tv0Var = this.b;
                org.telegram.ui.ActionBar.u0 u0Var = tv0Var.n0;
                mu0[] mu0VarArr = tv0Var.k0;
                tv0Var.f1 = null;
                if (tv0Var.i1) {
                    mu0VarArr[1].setVisibility(8);
                    if (u0Var == null || tv0Var.D()) {
                        tv0Var.o0 = tv0Var.b0(0.0f);
                        tv0Var.v1(0.0f);
                    } else {
                        u0Var.setVisibility(tv0Var.x0() ? 8 : 4);
                        tv0Var.o0 = 0.0f;
                    }
                    tv0Var.s1(false);
                    tv0Var.x0 = 0;
                } else {
                    mu0 mu0Var = mu0VarArr[0];
                    mu0VarArr[0] = mu0VarArr[1];
                    mu0VarArr[1] = mu0Var;
                    mu0Var.setVisibility(8);
                    if (u0Var != null && tv0Var.x0 == 2) {
                        u0Var.setVisibility(tv0Var.x0() ? 8 : 4);
                    }
                    tv0Var.x0 = 0;
                    tv0Var.b1(1.0f, mu0VarArr[0].F);
                    tv0Var.N0();
                    tv0Var.h1();
                }
                tv0Var.g1 = false;
                tv0Var.y1 = false;
                tv0Var.x1 = false;
                tv0Var.P0(false);
                tv0Var.G.setEnabled(true);
                tv0Var.I0.setEnabled(true);
                break;
        }
    }
}
