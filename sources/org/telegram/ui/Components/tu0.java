package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu0 b;

    public /* synthetic */ tu0(uu0 uu0Var, int i7) {
        this.a = i7;
        this.b = uu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                uu0 uu0Var = this.b;
                uu0Var.D = 1.0f;
                uu0Var.invalidate();
                uu0Var.G = null;
                break;
            case 1:
                uu0 uu0Var2 = this.b;
                uu0Var2.m(((Float) uu0Var2.w.getAnimatedValue()).floatValue());
                uu0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
