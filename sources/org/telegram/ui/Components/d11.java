package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f11 b;

    public /* synthetic */ d11(f11 f11Var, int i7) {
        this.a = i7;
        this.b = f11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f11 f11Var = this.b;
                f11Var.getClass();
                f11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11Var.h();
                f11Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f11 f11Var2 = this.b;
                f11Var2.L = max;
                f11Var2.h.invalidate();
                break;
        }
    }
}
