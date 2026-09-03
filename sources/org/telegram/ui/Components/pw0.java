package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw0 b;

    public /* synthetic */ pw0(sw0 sw0Var, int i10) {
        this.a = i10;
        this.b = sw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sw0 sw0Var = this.b;
                sw0Var.getClass();
                sw0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var.invalidate();
                break;
            case 1:
                sw0 sw0Var2 = this.b;
                sw0Var2.getClass();
                sw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                sw0 sw0Var3 = this.b;
                sw0Var3.getClass();
                sw0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var3.invalidate();
                break;
        }
    }
}
