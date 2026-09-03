package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ i61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j61 j61Var = (j61) this.b;
                j61Var.getClass();
                j61Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61Var.invalidate();
                break;
            case 1:
                p61 p61Var = (p61) this.b;
                p61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var.b = floatValue;
                p61Var.setTranslationY(floatValue);
                break;
            default:
                k81 k81Var = (k81) this.b;
                k81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k81Var.setAnimationIdicatorProgress(floatValue2);
                j81 j81Var = k81Var.y;
                if (j81Var != null) {
                    ((oh.h4) j81Var).f0(floatValue2);
                    break;
                }
                break;
        }
    }
}
