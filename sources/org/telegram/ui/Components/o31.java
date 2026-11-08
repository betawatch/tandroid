package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o31 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ t31 c;

    public o31(t31 t31Var, int i7) {
        this.c = t31Var;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        t31 t31Var = this.c;
        t31Var.N = true;
        t31Var.n.scrollBy(0, floatValue - this.a);
        t31Var.N = false;
        this.a = floatValue;
    }
}
