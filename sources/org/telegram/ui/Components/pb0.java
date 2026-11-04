package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ pb0(zb0 zb0Var, int i3) {
        this.a = i3;
        this.b = zb0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0 zb0Var = this.b;
                ai.d2 d2Var = zb0Var.e;
                d2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                d2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue));
                d2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                TextView textView = zb0Var.x;
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, floatValue));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, floatValue));
                zb0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue));
                break;
            default:
                zb0 zb0Var2 = this.b;
                zb0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0Var2.b0 = floatValue2;
                zb0Var2.h(floatValue2);
                zb0Var2.setAlpha(zb0Var2.b0);
                break;
        }
    }
}
