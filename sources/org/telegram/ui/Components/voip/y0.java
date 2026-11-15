package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.getClass();
                d1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                break;
            case 1:
                d1 d1Var2 = this.b;
                d1Var2.getClass();
                d1Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = d1Var2.J + org.telegram.messenger.g0.L(28.0f);
                float L2 = d1Var2.K + org.telegram.messenger.g0.L(52.0f);
                float f10 = d1Var2.E;
                d1Var2.H = L - (L * f10);
                d1Var2.I = L2 - (f10 * L2);
                d1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1 d1Var3 = this.b;
                d1Var3.F = floatValue;
                int L3 = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                b1 b1Var = d1Var3.c;
                b1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * d1Var3.F));
                b1Var.requestLayout();
                break;
            default:
                d1 d1Var4 = this.b;
                d1Var4.getClass();
                d1Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var4.e();
                break;
        }
    }
}
