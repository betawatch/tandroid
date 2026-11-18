package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
