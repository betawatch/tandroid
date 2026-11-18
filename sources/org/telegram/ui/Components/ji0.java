package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ji0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ vi0 b;

    public ji0(vi0 vi0Var, float f10) {
        this.b = vi0Var;
        this.a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vi0 vi0Var = this.b;
        vi0Var.p0 = floatValue;
        vi0Var.o0 = (1.0f - vi0Var.p0) * this.a;
        vi0Var.invalidate();
    }
}
