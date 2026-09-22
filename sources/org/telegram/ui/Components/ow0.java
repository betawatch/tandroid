package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rw0 b;

    public /* synthetic */ ow0(rw0 rw0Var, int i10) {
        this.a = i10;
        this.b = rw0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rw0 rw0Var = this.b;
                rw0Var.getClass();
                rw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var.invalidate();
                break;
            case 1:
                rw0 rw0Var2 = this.b;
                rw0Var2.getClass();
                rw0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                rw0 rw0Var3 = this.b;
                rw0Var3.getClass();
                rw0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var3.invalidate();
                break;
        }
    }
}
