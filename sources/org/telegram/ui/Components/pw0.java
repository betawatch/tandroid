package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
