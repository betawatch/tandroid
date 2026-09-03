package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dk0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ pk0 b;

    public dk0(pk0 pk0Var, float f10) {
        this.b = pk0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pk0 pk0Var = this.b;
        pk0Var.l0 = floatValue;
        pk0Var.k0 = (1.0f - pk0Var.l0) * this.a;
        pk0Var.invalidate();
    }
}
