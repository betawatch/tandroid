package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ u0(z0 z0Var, int i7) {
        this.a = i7;
        this.b = z0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z0 z0Var = this.b;
                z0Var.getClass();
                z0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var.invalidate();
                break;
            case 1:
                z0 z0Var2 = this.b;
                z0Var2.getClass();
                z0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = z0Var2.I + org.telegram.messenger.g0.L(28.0f);
                float L2 = z0Var2.J + org.telegram.messenger.g0.L(52.0f);
                float f10 = z0Var2.D;
                z0Var2.G = L - (L * f10);
                z0Var2.H = L2 - (f10 * L2);
                z0Var2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0 z0Var3 = this.b;
                z0Var3.E = floatValue;
                int L3 = (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                x0 x0Var = z0Var3.c;
                x0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L3 * z0Var3.E));
                x0Var.requestLayout();
                break;
            default:
                z0 z0Var4 = this.b;
                z0Var4.getClass();
                z0Var4.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var4.e();
                break;
        }
    }
}
