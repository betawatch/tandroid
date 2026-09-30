package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ u61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v61 v61Var = (v61) this.b;
                v61Var.getClass();
                v61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.invalidate();
                break;
            case 1:
                b71 b71Var = (b71) this.b;
                b71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b71Var.b = floatValue;
                b71Var.setTranslationY(floatValue);
                break;
            default:
                x81 x81Var = (x81) this.b;
                x81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x81Var.setAnimationIdicatorProgress(floatValue2);
                w81 w81Var = x81Var.y;
                if (w81Var != null) {
                    ((l.d) w81Var).L(floatValue2);
                    break;
                }
                break;
        }
    }
}
