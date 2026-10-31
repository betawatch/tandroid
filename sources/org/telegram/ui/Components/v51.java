package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ v51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w51 w51Var = (w51) this.b;
                w51Var.getClass();
                w51Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.invalidate();
                break;
            case 1:
                c61 c61Var = (c61) this.b;
                c61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c61Var.b = floatValue;
                c61Var.setTranslationY(floatValue);
                break;
            default:
                v71 v71Var = (v71) this.b;
                v71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.setAnimationIdicatorProgress(floatValue2);
                u71 u71Var = v71Var.D;
                if (u71Var != null) {
                    ((n2.u) u71Var).J(floatValue2);
                    break;
                }
                break;
        }
    }
}
