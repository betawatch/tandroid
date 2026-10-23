package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ r51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t51 t51Var = (t51) this.b;
                t51Var.getClass();
                t51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t51Var.invalidate();
                break;
            case 1:
                k71 k71Var = (k71) this.b;
                k71Var.getClass();
                k71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k71Var.invalidate();
                break;
            case 2:
                q71 q71Var = (q71) this.b;
                q71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q71Var.b = floatValue;
                q71Var.setTranslationY(floatValue);
                break;
            default:
                k91 k91Var = (k91) this.b;
                k91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.setAnimationIdicatorProgress(floatValue2);
                j91 j91Var = k91Var.y;
                if (j91Var != null) {
                    ((l2.f) j91Var).I(floatValue2);
                    break;
                }
                break;
        }
    }
}
