package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ f2(g2 g2Var, int i3) {
        this.a = i3;
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
                g2Var2.d = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(56.0f));
                g2Var2.e = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(36.0f));
                g2Var2.f = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(60.0f));
                g2Var2.h = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(36.0f));
                g2Var2.n = org.telegram.messenger.g0.W1(floatValue, g2Var2.G, org.telegram.messenger.g0.L(64.0f));
                g2Var2.r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                g2Var2.s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                g2Var2.w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                g2Var2.x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                g2Var2.y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                g2Var2.invalidate();
                break;
        }
    }
}
