package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class t61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ t61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u61 u61Var = (u61) this.b;
                u61Var.getClass();
                u61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var.invalidate();
                break;
            case 1:
                a71 a71Var = (a71) this.b;
                a71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a71Var.b = floatValue;
                a71Var.setTranslationY(floatValue);
                break;
            default:
                w81 w81Var = (w81) this.b;
                w81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w81Var.setAnimationIdicatorProgress(floatValue2);
                v81 v81Var = w81Var.y;
                if (v81Var != null) {
                    ((l.d) v81Var).M(floatValue2);
                    break;
                }
                break;
        }
    }
}
