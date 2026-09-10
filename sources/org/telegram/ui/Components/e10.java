package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g10 b;

    public /* synthetic */ e10(g10 g10Var, int i10) {
        this.a = i10;
        this.b = g10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g10 g10Var = this.b;
                g10Var.getClass();
                g10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var.invalidate();
                break;
            case 1:
                g10 g10Var2 = this.b;
                g10Var2.getClass();
                g10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                g10Var2.invalidate();
                break;
            default:
                g10 g10Var3 = this.b;
                g10Var3.getClass();
                g10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var3.invalidate();
                break;
        }
    }
}
