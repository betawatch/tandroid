package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b11 b;

    public /* synthetic */ z01(b11 b11Var, int i7) {
        this.a = i7;
        this.b = b11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                di.b3 b3Var = this.b.f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                break;
            default:
                b11 b11Var = this.b;
                b11Var.getClass();
                b11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.h();
                break;
        }
    }
}
