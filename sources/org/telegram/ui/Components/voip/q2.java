package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ q2(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r2Var.d = intValue;
                r2Var.e = intValue;
                r2Var.f = intValue;
                r2Var.h = intValue;
                r2Var.n = intValue;
                r2Var.invalidate();
                break;
            default:
                r2 r2Var2 = this.b;
                r2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var2.d = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(56.0f));
                r2Var2.e = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(36.0f));
                r2Var2.f = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(60.0f));
                r2Var2.h = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(36.0f));
                r2Var2.n = org.telegram.messenger.g0.W1(floatValue, r2Var2.F, org.telegram.messenger.g0.L(64.0f));
                r2Var2.r = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(50.0f));
                r2Var2.s = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(20.0f));
                r2Var2.w = org.telegram.messenger.g0.W1(floatValue, 0, 0);
                r2Var2.x = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-20.0f));
                r2Var2.y = org.telegram.messenger.g0.W1(floatValue, 0, org.telegram.messenger.g0.L(-40.0f));
                r2Var2.invalidate();
                break;
        }
    }
}
