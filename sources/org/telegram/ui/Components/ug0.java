package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ug0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ ug0(vg0 vg0Var, int i10) {
        this.a = i10;
        this.b = vg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vg0 vg0Var = this.b;
                vg0Var.h = false;
                vg0Var.a = vg0Var.c;
                vg0Var.invalidate();
                int i10 = vg0Var.J;
                if (i10 >= 0) {
                    vg0Var.b(i10);
                    vg0Var.J = -1;
                    break;
                }
                break;
            default:
                vg0 vg0Var2 = this.b;
                vg0Var2.n = false;
                vg0Var2.h = false;
                vg0Var2.invalidate();
                int i11 = vg0Var2.J;
                if (i11 >= 0) {
                    vg0Var2.b(i11);
                    vg0Var2.J = -1;
                }
                vg0Var2.a();
                break;
        }
    }
}
