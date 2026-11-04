package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ na0(xd0 xd0Var, int i3) {
        this.a = i3;
        this.b = xd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xd0 xd0Var = this.b;
                xd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.c.setAlpha(floatValue);
                xd0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                break;
            case 1:
                xd0 xd0Var2 = this.b;
                xd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                xd0Var2.W.setScaleX(f10);
                xd0Var2.W.setScaleY(f10);
                xd0Var2.W.setAlpha(floatValue2);
                break;
            default:
                xd0 xd0Var3 = this.b;
                xd0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var3.c.setAlpha(floatValue3);
                xd0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                break;
        }
    }
}
