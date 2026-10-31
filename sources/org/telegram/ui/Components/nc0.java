package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc0 b;

    public /* synthetic */ nc0(zc0 zc0Var, int i10) {
        this.a = i10;
        this.b = zc0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0 zc0Var = this.b;
                org.telegram.ui.Cells.a5 a5Var = zc0Var.e;
                a5Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue));
                a5Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue));
                a5Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, floatValue));
                TextView textView = zc0Var.x;
                textView.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, floatValue));
                zc0Var.s.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, floatValue));
                break;
            default:
                zc0 zc0Var2 = this.b;
                zc0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0Var2.a0 = floatValue2;
                zc0Var2.h(floatValue2);
                zc0Var2.setAlpha(zc0Var2.a0);
                break;
        }
    }
}
