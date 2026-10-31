package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ o(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                h4Var.getClass();
                h4Var.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h4 h4Var2 = this.b;
                h4Var2.Z0 = floatValue;
                h4Var2.q0.setTranslationY(((1.0f - floatValue) * org.telegram.messenger.i0.L(51.0f)) + h4Var2.p0);
                break;
        }
    }
}
