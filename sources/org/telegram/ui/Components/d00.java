package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f00 b;

    public /* synthetic */ d00(f00 f00Var, int i10) {
        this.a = i10;
        this.b = f00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f00 f00Var = this.b;
                f00Var.getClass();
                f00Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f00Var.invalidate();
                break;
            case 1:
                f00 f00Var2 = this.b;
                f00Var2.getClass();
                f00Var2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f00Var2.invalidate();
                break;
            default:
                f00 f00Var3 = this.b;
                f00Var3.getClass();
                f00Var3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f00Var3.invalidate();
                break;
        }
    }
}
