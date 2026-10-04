package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class a10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ a10(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b10 b10Var = this.b;
                b10Var.getClass();
                b10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var.invalidate();
                break;
            case 1:
                b10 b10Var2 = this.b;
                b10Var2.getClass();
                b10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                b10Var2.invalidate();
                break;
            default:
                b10 b10Var3 = this.b;
                b10Var3.getClass();
                b10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b10Var3.invalidate();
                break;
        }
    }
}
