package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a21 b;

    public /* synthetic */ y11(a21 a21Var, int i7) {
        this.a = i7;
        this.b = a21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a21 a21Var = this.b;
                a21Var.getClass();
                a21Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.h();
                a21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a21 a21Var2 = this.b;
                a21Var2.M = max;
                a21Var2.h.invalidate();
                break;
        }
    }
}
