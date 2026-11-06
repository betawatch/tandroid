package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu0 b;

    public /* synthetic */ qu0(tu0 tu0Var, int i7) {
        this.a = i7;
        this.b = tu0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tu0 tu0Var = this.b;
                tu0Var.getClass();
                tu0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tu0Var.invalidate();
                break;
            case 1:
                tu0 tu0Var2 = this.b;
                tu0Var2.getClass();
                tu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                tu0 tu0Var3 = this.b;
                tu0Var3.getClass();
                tu0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tu0Var3.invalidate();
                break;
        }
    }
}
