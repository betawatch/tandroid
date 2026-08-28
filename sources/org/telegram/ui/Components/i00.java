package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;

    public /* synthetic */ i00(j00 j00Var, int i9) {
        this.a = i9;
        this.b = j00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j00 j00Var = this.b;
                j00Var.getClass();
                j00Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var.invalidate();
                break;
            case 1:
                j00 j00Var2 = this.b;
                j00Var2.getClass();
                j00Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                j00Var2.invalidate();
                break;
            default:
                j00 j00Var3 = this.b;
                j00Var3.getClass();
                j00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var3.invalidate();
                break;
        }
    }
}
