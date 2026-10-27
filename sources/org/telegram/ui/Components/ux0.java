package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx0 b;

    public /* synthetic */ ux0(xx0 xx0Var, int i10) {
        this.a = i10;
        this.b = xx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xx0 xx0Var = this.b;
                xx0Var.getClass();
                xx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var.invalidate();
                break;
            case 1:
                xx0 xx0Var2 = this.b;
                xx0Var2.getClass();
                xx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                xx0 xx0Var3 = this.b;
                xx0Var3.getClass();
                xx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var3.invalidate();
                break;
        }
    }
}
