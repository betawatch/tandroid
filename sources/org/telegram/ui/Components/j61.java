package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k61 k61Var = (k61) this.b;
                k61Var.getClass();
                k61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k61Var.invalidate();
                break;
            case 1:
                q61 q61Var = (q61) this.b;
                q61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q61Var.b = floatValue;
                q61Var.setTranslationY(floatValue);
                break;
            default:
                l81 l81Var = (l81) this.b;
                l81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l81Var.setAnimationIdicatorProgress(floatValue2);
                k81 k81Var = l81Var.y;
                if (k81Var != null) {
                    ((oh.h4) k81Var).f0(floatValue2);
                    break;
                }
                break;
        }
    }
}
