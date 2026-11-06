package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ e3(k3 k3Var, int i7) {
        this.a = i7;
        this.b = k3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.getClass();
                k3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                break;
            case 1:
                k3 k3Var2 = this.b;
                k3Var2.getClass();
                k3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                k3 k3Var3 = this.b;
                k3Var3.getClass();
                k3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var3.invalidate();
                break;
        }
    }
}
