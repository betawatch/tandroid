package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ g60(l60 l60Var, int i10) {
        this.a = i10;
        this.b = l60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l60 l60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * l60Var.getMeasuredHeight() * 0.5f;
                l60Var.w0 = floatValue;
                l60Var.v.setTranslationY(floatValue + l60Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l60 l60Var2 = this.b;
                l60Var2.y0 = floatValue2;
                si.s0 s0Var = l60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
