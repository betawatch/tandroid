package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh0 b;

    public /* synthetic */ yg0(bh0 bh0Var, int i10) {
        this.a = i10;
        this.b = bh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bh0 bh0Var = this.b;
                bh0Var.getClass();
                bh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh0Var.c(true);
                break;
            default:
                bh0 bh0Var2 = this.b;
                bh0Var2.getClass();
                bh0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh0Var2.c(true);
                break;
        }
    }
}
