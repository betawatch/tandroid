package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ g61(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h61 h61Var = (h61) this.b;
                h61Var.getClass();
                h61Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h61Var.invalidate();
                break;
            case 1:
                n61 n61Var = (n61) this.b;
                n61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var.b = floatValue;
                n61Var.setTranslationY(floatValue);
                break;
            default:
                i81 i81Var = (i81) this.b;
                i81Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i81Var.setAnimationIdicatorProgress(floatValue2);
                h81 h81Var = i81Var.y;
                if (h81Var != null) {
                    ((ka.c) h81Var).h(floatValue2);
                    break;
                }
                break;
        }
    }
}
