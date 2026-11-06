package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ ii0 b;

    public wh0(ii0 ii0Var, float f10) {
        this.b = ii0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ii0 ii0Var = this.b;
        ii0Var.o0 = floatValue;
        ii0Var.n0 = (1.0f - ii0Var.o0) * this.a;
        ii0Var.invalidate();
    }
}
