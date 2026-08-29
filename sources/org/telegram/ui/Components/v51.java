package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ v51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w51 w51Var = (w51) this.b;
                w51Var.getClass();
                w51Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.invalidate();
                break;
            case 1:
                d61 d61Var = (d61) this.b;
                d61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d61Var.b = floatValue;
                d61Var.setTranslationY(floatValue);
                break;
            default:
                y71 y71Var = (y71) this.b;
                y71Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y71Var.setAnimationIdicatorProgress(floatValue2);
                x71 x71Var = y71Var.y;
                if (x71Var != null) {
                    ((n) x71Var).j(floatValue2);
                    break;
                }
                break;
        }
    }
}
