package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ p(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                g4Var.getClass();
                g4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4 g4Var2 = this.b;
                g4Var2.a1 = floatValue;
                g4Var2.r0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.g0.L(51.0f)) + g4Var2.q0);
                break;
        }
    }
}
