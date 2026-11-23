package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ v40(b50 b50Var, int i7) {
        this.a = i7;
        this.b = b50Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b50 b50Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * b50Var.getMeasuredHeight() * 0.5f;
                b50Var.y0 = floatValue;
                b50Var.s.setTranslationY(floatValue + b50Var.x0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b50 b50Var2 = this.b;
                b50Var2.A0 = floatValue2;
                zi.u0 u0Var = b50Var2.P;
                if (u0Var != null) {
                    u0Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
