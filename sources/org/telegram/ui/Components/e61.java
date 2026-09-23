package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f61 f61Var = (f61) this.b;
                f61Var.getClass();
                f61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f61Var.invalidate();
                break;
            case 1:
                l61 l61Var = (l61) this.b;
                l61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l61Var.b = floatValue;
                l61Var.setTranslationY(floatValue);
                break;
            default:
                g81 g81Var = (g81) this.b;
                g81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g81Var.setAnimationIdicatorProgress(floatValue2);
                f81 f81Var = g81Var.y;
                if (f81Var != null) {
                    ((ka.c) f81Var).h(floatValue2);
                    break;
                }
                break;
        }
    }
}
