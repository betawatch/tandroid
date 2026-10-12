package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                    if (u0Var == null || xv0Var.D()) {
                        xv0Var.o0 = xv0Var.b0(0.0f);
                        xv0Var.s1(0.0f);
                    } else {
                        u0Var.setVisibility(xv0Var.v0() ? 8 : 4);
                        xv0Var.o0 = 0.0f;
                    }
                    xv0Var.q1(false);
                    xv0Var.x0 = 0;
                } else {
                    qu0 qu0Var = qu0VarArr[0];
                    qu0VarArr[0] = qu0VarArr[1];
                    qu0VarArr[1] = qu0Var;
                    qu0Var.setVisibility(8);
                    if (u0Var != null && xv0Var.x0 == 2) {
                        u0Var.setVisibility(xv0Var.v0() ? 8 : 4);
                    }
                    xv0Var.x0 = 0;
                    xv0Var.Z0(1.0f, qu0VarArr[0].F);
                    xv0Var.L0();
                    xv0Var.f1();
                }
                xv0Var.g1 = false;
                xv0Var.y1 = false;
                xv0Var.x1 = false;
                xv0Var.N0(false);
                xv0Var.G.setEnabled(true);
                xv0Var.I0.setEnabled(true);
                break;
        }
    }
}
