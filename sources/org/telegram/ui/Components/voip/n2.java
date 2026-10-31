package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ n2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.getClass();
                q2Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                break;
            case 1:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                q2Var2.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q2Var2.invalidate();
                break;
            case 2:
                q2 q2Var3 = this.b;
                q2Var3.getClass();
                q2Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q2Var3.invalidate();
                break;
            default:
                q2 q2Var4 = this.b;
                q2Var4.getClass();
                q2Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                q2Var4.invalidate();
                break;
        }
    }
}
