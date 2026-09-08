package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class uf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf0 b;

    public /* synthetic */ uf0(vf0 vf0Var, int i10) {
        this.a = i10;
        this.b = vf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vf0 vf0Var = this.b;
                vf0Var.h = false;
                vf0Var.a = vf0Var.c;
                vf0Var.invalidate();
                int i10 = vf0Var.J;
                if (i10 >= 0) {
                    vf0Var.b(i10);
                    vf0Var.J = -1;
                    break;
                }
                break;
            default:
                vf0 vf0Var2 = this.b;
                vf0Var2.n = false;
                vf0Var2.h = false;
                vf0Var2.invalidate();
                int i11 = vf0Var2.J;
                if (i11 >= 0) {
                    vf0Var2.b(i11);
                    vf0Var2.J = -1;
                }
                vf0Var2.a();
                break;
        }
    }
}
