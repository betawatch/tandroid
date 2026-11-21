package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ se0 b;

    public /* synthetic */ qe0(se0 se0Var, int i7) {
        this.a = i7;
        this.b = se0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                se0 se0Var = this.b;
                se0Var.getClass();
                se0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se0Var.invalidate();
                break;
            default:
                se0 se0Var2 = this.b;
                se0Var2.getClass();
                se0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se0Var2.invalidate();
                break;
        }
    }
}
