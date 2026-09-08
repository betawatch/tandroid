package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class pw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qw0 b;

    public /* synthetic */ pw0(qw0 qw0Var, int i10) {
        this.a = i10;
        this.b = qw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qw0 qw0Var = this.b;
                qw0Var.y = 1.0f;
                qw0Var.invalidate();
                qw0Var.G = null;
                break;
            case 1:
                qw0 qw0Var2 = this.b;
                qw0Var2.m(((Float) qw0Var2.v.getAnimatedValue()).floatValue());
                qw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
