package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ f61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g61 g61Var = (g61) this.b;
                g61Var.getClass();
                g61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g61Var.invalidate();
                break;
            case 1:
                m61 m61Var = (m61) this.b;
                m61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m61Var.b = floatValue;
                m61Var.setTranslationY(floatValue);
                break;
            default:
                h81 h81Var = (h81) this.b;
                h81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var.setAnimationIdicatorProgress(floatValue2);
                g81 g81Var = h81Var.y;
                if (g81Var != null) {
                    ((ka.c) g81Var).h(floatValue2);
                    break;
                }
                break;
        }
    }
}
