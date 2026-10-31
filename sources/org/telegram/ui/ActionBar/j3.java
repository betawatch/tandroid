package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    public /* synthetic */ j3(q3 q3Var, int i10) {
        this.a = i10;
        this.b = q3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q3 q3Var = this.b;
                q3Var.getClass();
                q3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3Var.invalidate();
                break;
            case 1:
                q3 q3Var2 = this.b;
                q3Var2.getClass();
                q3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                q3 q3Var3 = this.b;
                q3Var3.getClass();
                q3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3Var3.invalidate();
                break;
        }
    }
}
