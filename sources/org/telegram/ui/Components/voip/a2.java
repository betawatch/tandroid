package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ a2(b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                b2Var.getClass();
                b2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.a(b2Var.R, b2Var.S);
                break;
            default:
                b2 b2Var2 = this.b;
                b2Var2.getClass();
                b2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var2.invalidate();
                break;
        }
    }
}
