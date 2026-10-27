package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ t71(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u71 u71Var = (u71) this.b;
                u71Var.getClass();
                u71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var.invalidate();
                break;
            case 1:
                a81 a81Var = (a81) this.b;
                a81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a81Var.b = floatValue;
                a81Var.setTranslationY(floatValue);
                break;
            default:
                u91 u91Var = (u91) this.b;
                u91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u91Var.setAnimationIdicatorProgress(floatValue2);
                t91 t91Var = u91Var.y;
                if (t91Var != null) {
                    ((jg.i) t91Var).e0(floatValue2);
                    break;
                }
                break;
        }
    }
}
