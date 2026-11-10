package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec0 b;

    public /* synthetic */ ub0(ec0 ec0Var, int i7) {
        this.a = i7;
        this.b = ec0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0 ec0Var = this.b;
                di.b4 b4Var = ec0Var.e;
                b4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                b4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                b4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = ec0Var.x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                ec0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                break;
            default:
                ec0 ec0Var2 = this.b;
                ec0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0Var2.a0 = floatValue2;
                ec0Var2.h(floatValue2);
                ec0Var2.setAlpha(ec0Var2.a0);
                break;
        }
    }
}
