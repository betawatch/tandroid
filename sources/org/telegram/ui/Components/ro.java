package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ro implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ b11 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ dp e;

    public ro(dp dpVar, b11 b11Var, float f7, boolean z10) {
        this.e = dpVar;
        this.b = b11Var;
        this.c = f7;
        this.d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dp dpVar = this.e;
        dpVar.I1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || dpVar.I1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
