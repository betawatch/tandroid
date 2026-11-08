package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
