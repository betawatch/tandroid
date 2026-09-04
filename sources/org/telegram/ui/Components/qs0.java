package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class qs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ qs0(xu0 xu0Var, int i10) {
        this.a = i10;
        this.b = xu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                xu0 xu0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = xu0Var.n0;
                qt0[] qt0VarArr = xu0Var.k0;
                xu0Var.f1 = null;
                if (xu0Var.i1) {
                    qt0VarArr[1].setVisibility(8);
                    if (v0Var == null || xu0Var.D()) {
                        xu0Var.o0 = xu0Var.b0(0.0f);
                        xu0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(xu0Var.v0() ? 8 : 4);
                        xu0Var.o0 = 0.0f;
                    }
                    xu0Var.q1(false);
                    xu0Var.x0 = 0;
                } else {
                    qt0 qt0Var = qt0VarArr[0];
                    qt0VarArr[0] = qt0VarArr[1];
                    qt0VarArr[1] = qt0Var;
                    qt0Var.setVisibility(8);
                    if (v0Var != null && xu0Var.x0 == 2) {
                        v0Var.setVisibility(xu0Var.v0() ? 8 : 4);
                    }
                    xu0Var.x0 = 0;
                    xu0Var.Z0(1.0f, qt0VarArr[0].F);
                    xu0Var.L0();
                    xu0Var.f1();
                }
                xu0Var.g1 = false;
                xu0Var.y1 = false;
                xu0Var.x1 = false;
                xu0Var.N0(false);
                xu0Var.G.setEnabled(true);
                xu0Var.I0.setEnabled(true);
                break;
        }
    }
}
