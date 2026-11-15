package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ai0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ mi0 b;

    public ai0(mi0 mi0Var, float f10) {
        this.b = mi0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mi0 mi0Var = this.b;
        mi0Var.p0 = floatValue;
        mi0Var.o0 = (1.0f - mi0Var.p0) * this.a;
        mi0Var.invalidate();
    }
}
