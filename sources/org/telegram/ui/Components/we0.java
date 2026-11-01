package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye0 b;

    public /* synthetic */ we0(ye0 ye0Var, int i10) {
        this.a = i10;
        this.b = ye0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ye0 ye0Var = this.b;
                ye0Var.getClass();
                ye0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var.invalidate();
                break;
            default:
                ye0 ye0Var2 = this.b;
                ye0Var2.getClass();
                ye0Var2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var2.invalidate();
                break;
        }
    }
}
