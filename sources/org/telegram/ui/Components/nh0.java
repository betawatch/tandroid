package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;

    public /* synthetic */ nh0(qh0 qh0Var, int i10) {
        this.a = i10;
        this.b = qh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qh0 qh0Var = this.b;
                qh0Var.getClass();
                qh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var.c(true);
                break;
            default:
                qh0 qh0Var2 = this.b;
                qh0Var2.getClass();
                qh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var2.c(true);
                break;
        }
    }
}
