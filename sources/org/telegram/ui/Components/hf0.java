package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf0 b;

    public /* synthetic */ hf0(kf0 kf0Var, int i7) {
        this.a = i7;
        this.b = kf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kf0 kf0Var = this.b;
                kf0Var.getClass();
                kf0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf0Var.c(true);
                break;
            default:
                kf0 kf0Var2 = this.b;
                kf0Var2.getClass();
                kf0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf0Var2.c(true);
                break;
        }
    }
}
