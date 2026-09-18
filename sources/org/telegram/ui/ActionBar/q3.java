package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ q3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y3 y3Var = this.b;
                y3Var.getClass();
                y3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.invalidate();
                break;
            case 1:
                y3 y3Var2 = this.b;
                y3Var2.getClass();
                y3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.invalidate();
                break;
            default:
                y3 y3Var3 = this.b;
                y3Var3.getClass();
                y3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
