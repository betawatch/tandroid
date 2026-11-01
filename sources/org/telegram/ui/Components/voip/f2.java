package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ f2(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                g2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g2Var.d = intValue;
                g2Var.e = intValue;
                g2Var.f = intValue;
                g2Var.h = intValue;
                g2Var.n = intValue;
                g2Var.invalidate();
                break;
            default:
                g2 g2Var2 = this.b;
                g2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var2.d = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(56.0f));
                g2Var2.e = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(36.0f));
                g2Var2.f = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(60.0f));
                g2Var2.h = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(36.0f));
                g2Var2.n = org.telegram.messenger.i0.W1(floatValue, g2Var2.F, org.telegram.messenger.i0.L(64.0f));
                g2Var2.r = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(50.0f));
                g2Var2.s = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(20.0f));
                g2Var2.w = org.telegram.messenger.i0.W1(floatValue, 0, 0);
                g2Var2.x = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-20.0f));
                g2Var2.y = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-40.0f));
                g2Var2.invalidate();
                break;
        }
    }
}
