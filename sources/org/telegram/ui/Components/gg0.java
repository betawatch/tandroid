package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ gg0(ig0 ig0Var, int i10) {
        this.a = i10;
        this.b = ig0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.getClass();
                ig0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var.invalidate();
                break;
            default:
                ig0 ig0Var2 = this.b;
                ig0Var2.getClass();
                ig0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig0Var2.invalidate();
                break;
        }
    }
}
