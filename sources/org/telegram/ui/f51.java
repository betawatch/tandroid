package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ f51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51 i51Var = this.b;
                i51Var.N = floatValue;
                i51Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51 i51Var2 = this.b;
                i51Var2.N = floatValue2;
                i51Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51 i51Var3 = this.b;
                i51Var3.N = floatValue3;
                i51Var3.V.h0.invalidate();
                break;
        }
    }
}
