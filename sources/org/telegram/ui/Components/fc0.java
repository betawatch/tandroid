package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ fc0(pc0 pc0Var, int i7) {
        this.a = i7;
        this.b = pc0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0 pc0Var = this.b;
                bi.p2 p2Var = pc0Var.e;
                p2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                p2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                p2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = pc0Var.x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                pc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                break;
            default:
                pc0 pc0Var2 = this.b;
                pc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0Var2.b0 = floatValue2;
                pc0Var2.h(floatValue2);
                pc0Var2.setAlpha(pc0Var2.b0);
                break;
        }
    }
}
