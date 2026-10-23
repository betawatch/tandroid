package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ th0 b;

    public /* synthetic */ qh0(th0 th0Var, int i10) {
        this.a = i10;
        this.b = th0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                th0 th0Var = this.b;
                th0Var.getClass();
                th0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var.c(true);
                break;
            default:
                th0 th0Var2 = this.b;
                th0Var2.getClass();
                th0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th0Var2.c(true);
                break;
        }
    }
}
