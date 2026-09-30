package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ ax0(dx0 dx0Var, int i10) {
        this.a = i10;
        this.b = dx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dx0 dx0Var = this.b;
                dx0Var.getClass();
                dx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.invalidate();
                break;
            case 1:
                dx0 dx0Var2 = this.b;
                dx0Var2.getClass();
                dx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                dx0 dx0Var3 = this.b;
                dx0Var3.getClass();
                dx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var3.invalidate();
                break;
        }
    }
}
