package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kx0 b;

    public /* synthetic */ hx0(kx0 kx0Var, int i10) {
        this.a = i10;
        this.b = kx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kx0 kx0Var = this.b;
                kx0Var.getClass();
                kx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.invalidate();
                break;
            case 1:
                kx0 kx0Var2 = this.b;
                kx0Var2.getClass();
                kx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                kx0 kx0Var3 = this.b;
                kx0Var3.getClass();
                kx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var3.invalidate();
                break;
        }
    }
}
