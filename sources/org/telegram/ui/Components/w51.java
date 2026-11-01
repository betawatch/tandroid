package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ w51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x51 x51Var = (x51) this.b;
                x51Var.getClass();
                x51Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.invalidate();
                break;
            case 1:
                d61 d61Var = (d61) this.b;
                d61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d61Var.b = floatValue;
                d61Var.setTranslationY(floatValue);
                break;
            default:
                w71 w71Var = (w71) this.b;
                w71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var.setAnimationIdicatorProgress(floatValue2);
                v71 v71Var = w71Var.D;
                if (v71Var != null) {
                    ((n2.u) v71Var).J(floatValue2);
                    break;
                }
                break;
        }
    }
}
