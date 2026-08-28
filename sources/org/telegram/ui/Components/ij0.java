package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ij0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ uj0 b;

    public ij0(uj0 uj0Var, float f10) {
        this.b = uj0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uj0 uj0Var = this.b;
        uj0Var.k0 = floatValue;
        uj0Var.j0 = (1.0f - uj0Var.k0) * this.a;
        uj0Var.invalidate();
    }
}
