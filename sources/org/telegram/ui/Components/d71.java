package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class d71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ d71(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e71 e71Var = (e71) this.b;
                e71Var.getClass();
                e71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e71Var.invalidate();
                break;
            case 1:
                l71 l71Var = (l71) this.b;
                l71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.b = floatValue;
                l71Var.setTranslationY(floatValue);
                break;
            default:
                f91 f91Var = (f91) this.b;
                f91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f91Var.setAnimationIdicatorProgress(floatValue2);
                e91 e91Var = f91Var.y;
                if (e91Var != null) {
                    ((n2.c) e91Var).k(floatValue2);
                    break;
                }
                break;
        }
    }
}
