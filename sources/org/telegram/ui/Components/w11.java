package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y11 b;

    public /* synthetic */ w11(y11 y11Var, int i7) {
        this.a = i7;
        this.b = y11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y11 y11Var = this.b;
                y11Var.getClass();
                y11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.h();
                y11Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                y11 y11Var2 = this.b;
                y11Var2.M = max;
                y11Var2.h.invalidate();
                break;
        }
    }
}
