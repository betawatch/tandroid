package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ i51(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j51 j51Var = (j51) this.b;
                j51Var.getClass();
                j51Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51Var.invalidate();
                break;
            case 1:
                p51 p51Var = (p51) this.b;
                p51Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p51Var.b = floatValue;
                p51Var.setTranslationY(floatValue);
                break;
            default:
                i71 i71Var = (i71) this.b;
                i71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var.setAnimationIdicatorProgress(floatValue2);
                h71 h71Var = i71Var.E;
                if (h71Var != null) {
                    h71Var.g(floatValue2);
                    break;
                }
                break;
        }
    }
}
