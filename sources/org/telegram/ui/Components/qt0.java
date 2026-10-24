package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ qt0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                xv0 xv0Var = this.b;
                org.telegram.ui.ActionBar.u0 u0Var = xv0Var.n0;
                qu0[] qu0VarArr = xv0Var.k0;
                xv0Var.f1 = null;
                if (xv0Var.i1) {
                    qu0VarArr[1].setVisibility(8);
                    if (u0Var == null || xv0Var.E()) {
                        xv0Var.o0 = xv0Var.c0(0.0f);
                        xv0Var.x1(0.0f);
                    } else {
                        u0Var.setVisibility(xv0Var.y0() ? 8 : 4);
                        xv0Var.o0 = 0.0f;
                    }
                    xv0Var.u1(false);
                    xv0Var.x0 = 0;
                } else {
                    qu0 qu0Var = qu0VarArr[0];
                    qu0VarArr[0] = qu0VarArr[1];
                    qu0VarArr[1] = qu0Var;
                    qu0Var.setVisibility(8);
                    if (u0Var != null && xv0Var.x0 == 2) {
                        u0Var.setVisibility(xv0Var.y0() ? 8 : 4);
                    }
                    xv0Var.x0 = 0;
                    xv0Var.c1(1.0f, qu0VarArr[0].F);
                    xv0Var.O0();
                    xv0Var.i1();
                }
                xv0Var.g1 = false;
                xv0Var.y1 = false;
                xv0Var.x1 = false;
                xv0Var.Q0(false);
                xv0Var.G.setEnabled(true);
                xv0Var.I0.setEnabled(true);
                break;
        }
    }
}
