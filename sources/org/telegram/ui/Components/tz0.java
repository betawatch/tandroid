package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz0 b;

    public /* synthetic */ tz0(uz0 uz0Var, int i9) {
        this.a = i9;
        this.b = uz0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uz0 uz0Var = this.b;
                uz0Var.getClass();
                uz0Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var.invalidate();
                break;
            case 1:
                uz0 uz0Var2 = this.b;
                uz0Var2.getClass();
                uz0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var2.invalidate();
                break;
            case 2:
                uz0 uz0Var3 = this.b;
                uz0Var3.getClass();
                uz0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var3.invalidate();
                break;
            case 3:
                uz0 uz0Var4 = this.b;
                uz0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var4.s = floatValue;
                uz0Var4.w = (int) ((uz0Var4.h * floatValue) + 0);
                uz0Var4.invalidate();
                break;
            default:
                uz0 uz0Var5 = this.b;
                uz0Var5.getClass();
                uz0Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var5.x = uz0Var5.r + ((int) Math.ceil((uz0Var5.n - r1) * r5));
                uz0Var5.invalidate();
                break;
        }
    }
}
