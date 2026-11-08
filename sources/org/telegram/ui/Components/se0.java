package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve0 b;

    public /* synthetic */ se0(ve0 ve0Var, int i7) {
        this.a = i7;
        this.b = ve0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ve0 ve0Var = this.b;
                ve0Var.getClass();
                ve0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var.c(true);
                break;
            default:
                ve0 ve0Var2 = this.b;
                ve0Var2.getClass();
                ve0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var2.c(true);
                break;
        }
    }
}
