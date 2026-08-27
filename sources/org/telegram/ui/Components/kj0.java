package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ wj0 b;

    public kj0(wj0 wj0Var, float f10) {
        this.b = wj0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wj0 wj0Var = this.b;
        wj0Var.k0 = floatValue;
        wj0Var.j0 = (1.0f - wj0Var.k0) * this.a;
        wj0Var.invalidate();
    }
}
