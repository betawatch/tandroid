package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s60 b;

    public /* synthetic */ m60(s60 s60Var, int i10) {
        this.a = i10;
        this.b = s60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s60 s60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * s60Var.getMeasuredHeight() * 0.5f;
                s60Var.v0 = floatValue;
                s60Var.v.setTranslationY(floatValue + s60Var.u0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s60 s60Var2 = this.b;
                s60Var2.x0 = floatValue2;
                ki.t0 t0Var = s60Var2.P;
                if (t0Var != null) {
                    t0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
