package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ uv0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                xv0Var.getClass();
                xv0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv0Var.invalidate();
                break;
            case 1:
                xv0 xv0Var2 = this.b;
                xv0Var2.getClass();
                xv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                xv0 xv0Var3 = this.b;
                xv0Var3.getClass();
                xv0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv0Var3.invalidate();
                break;
        }
    }
}
