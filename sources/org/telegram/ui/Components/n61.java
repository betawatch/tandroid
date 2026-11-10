package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n61(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u61 u61Var = (u61) this.b;
                u61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u61Var.setAnimationIdicatorProgress(floatValue);
                t61 t61Var = u61Var.D;
                if (t61Var != null) {
                    ((m) t61Var).y(floatValue);
                    break;
                }
                break;
            default:
                k60 k60Var = (k60) this.b;
                k60Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i60 i60Var = k60Var.x;
                if (i60Var != null) {
                    i60Var.setProgress(floatValue2);
                    break;
                }
                break;
        }
    }
}
