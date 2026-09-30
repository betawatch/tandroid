package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class cx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ cx0(dx0 dx0Var, int i10) {
        this.a = i10;
        this.b = dx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                dx0 dx0Var = this.b;
                dx0Var.y = 1.0f;
                dx0Var.invalidate();
                dx0Var.G = null;
                break;
            case 1:
                dx0 dx0Var2 = this.b;
                dx0Var2.m(((Float) dx0Var2.v.getAnimatedValue()).floatValue());
                dx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
