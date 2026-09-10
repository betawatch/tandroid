package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f31 b;

    public /* synthetic */ d31(f31 f31Var, int i10) {
        this.a = i10;
        this.b = f31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                org.telegram.ui.u7 u7Var = this.b.f;
                u7Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u7Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u7Var.invalidate();
                break;
            default:
                f31 f31Var = this.b;
                f31Var.getClass();
                f31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f31Var.h();
                break;
        }
    }
}
