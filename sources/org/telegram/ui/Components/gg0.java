package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
