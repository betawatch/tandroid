package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class h31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j31 b;

    public /* synthetic */ h31(j31 j31Var, int i10) {
        this.a = i10;
        this.b = j31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j31 j31Var = this.b;
                j31Var.getClass();
                j31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j31Var.h();
                j31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                j31 j31Var2 = this.b;
                j31Var2.K = max;
                j31Var2.h.invalidate();
                break;
        }
    }
}
