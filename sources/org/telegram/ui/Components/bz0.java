package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz0 b;

    public /* synthetic */ bz0(cz0 cz0Var, int i7) {
        this.a = i7;
        this.b = cz0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cz0 cz0Var = this.b;
                cz0Var.getClass();
                cz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var.invalidate();
                break;
            case 1:
                cz0 cz0Var2 = this.b;
                cz0Var2.getClass();
                cz0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var2.invalidate();
                break;
            case 2:
                cz0 cz0Var3 = this.b;
                cz0Var3.getClass();
                cz0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var3.invalidate();
                break;
            case 3:
                cz0 cz0Var4 = this.b;
                cz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var4.s = floatValue;
                cz0Var4.x = (int) ((cz0Var4.h * floatValue) + 0);
                cz0Var4.invalidate();
                break;
            default:
                cz0 cz0Var5 = this.b;
                cz0Var5.getClass();
                cz0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var5.y = cz0Var5.r + ((int) Math.ceil((cz0Var5.n - r1) * r5));
                cz0Var5.invalidate();
                break;
        }
    }
}
