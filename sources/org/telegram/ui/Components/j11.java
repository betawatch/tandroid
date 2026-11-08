package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l11 b;

    public /* synthetic */ j11(l11 l11Var, int i7) {
        this.a = i7;
        this.b = l11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l11 l11Var = this.b;
                l11Var.getClass();
                l11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.h();
                l11Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l11 l11Var2 = this.b;
                l11Var2.L = max;
                l11Var2.h.invalidate();
                break;
        }
    }
}
