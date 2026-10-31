package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ e2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f2Var.d = intValue;
                f2Var.e = intValue;
                f2Var.f = intValue;
                f2Var.h = intValue;
                f2Var.n = intValue;
                f2Var.invalidate();
                break;
            default:
                f2 f2Var2 = this.b;
                f2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var2.d = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(56.0f));
                f2Var2.e = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(36.0f));
                f2Var2.f = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(60.0f));
                f2Var2.h = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(36.0f));
                f2Var2.n = org.telegram.messenger.i0.W1(floatValue, f2Var2.F, org.telegram.messenger.i0.L(64.0f));
                f2Var2.r = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(50.0f));
                f2Var2.s = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(20.0f));
                f2Var2.w = org.telegram.messenger.i0.W1(floatValue, 0, 0);
                f2Var2.x = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-20.0f));
                f2Var2.y = org.telegram.messenger.i0.W1(floatValue, 0, org.telegram.messenger.i0.L(-40.0f));
                f2Var2.invalidate();
                break;
        }
    }
}
