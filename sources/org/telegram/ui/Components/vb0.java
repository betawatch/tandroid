package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc0 b;

    public /* synthetic */ vb0(fc0 fc0Var, int i7) {
        this.a = i7;
        this.b = fc0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0 fc0Var = this.b;
                bi.v1 v1Var = fc0Var.e;
                v1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                v1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                v1Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = fc0Var.x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                fc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                break;
            default:
                fc0 fc0Var2 = this.b;
                fc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var2.b0 = floatValue2;
                fc0Var2.h(floatValue2);
                fc0Var2.setAlpha(fc0Var2.b0);
                break;
        }
    }
}
