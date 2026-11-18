package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f51(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g51 g51Var = (g51) this.b;
                g51Var.getClass();
                g51Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51Var.invalidate();
                break;
            case 1:
                m51 m51Var = (m51) this.b;
                m51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.b = floatValue;
                m51Var.setTranslationY(floatValue);
                break;
            default:
                f71 f71Var = (f71) this.b;
                f71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.setAnimationIdicatorProgress(floatValue2);
                e71 e71Var = f71Var.E;
                if (e71Var != null) {
                    e71Var.g(floatValue2);
                    break;
                }
                break;
        }
    }
}
