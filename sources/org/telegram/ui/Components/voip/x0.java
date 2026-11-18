package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                c1Var.getClass();
                c1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                break;
            case 1:
                c1 c1Var2 = this.b;
                c1Var2.getClass();
                c1Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = c1Var2.J + org.telegram.messenger.g0.L(28.0f);
                float L2 = c1Var2.K + org.telegram.messenger.g0.L(52.0f);
                float f10 = c1Var2.E;
                c1Var2.H = L - (L * f10);
                c1Var2.I = L2 - (f10 * L2);
                c1Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1 c1Var3 = this.b;
                c1Var3.F = floatValue;
                int L3 = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                a1 a1Var = c1Var3.c;
                a1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * c1Var3.F));
                a1Var.requestLayout();
                break;
            default:
                c1 c1Var4 = this.b;
                c1Var4.getClass();
                c1Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var4.e();
                break;
        }
    }
}
