package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ e3(k3 k3Var, int i7) {
        this.a = i7;
        this.b = k3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.getClass();
                k3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.invalidate();
                break;
            case 1:
                k3 k3Var2 = this.b;
                k3Var2.getClass();
                k3Var2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                k3 k3Var3 = this.b;
                k3Var3.getClass();
                k3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var3.invalidate();
                break;
        }
    }
}
