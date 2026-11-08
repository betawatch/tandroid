package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class wh0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ ii0 b;

    public wh0(ii0 ii0Var, float f10) {
        this.b = ii0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ii0 ii0Var = this.b;
        ii0Var.o0 = floatValue;
        ii0Var.n0 = (1.0f - ii0Var.o0) * this.a;
        ii0Var.invalidate();
    }
}
