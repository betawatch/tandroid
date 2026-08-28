package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zv0 b;

    public /* synthetic */ wv0(zv0 zv0Var, int i9) {
        this.a = i9;
        this.b = zv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zv0 zv0Var = this.b;
                zv0Var.getClass();
                zv0Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zv0Var.invalidate();
                break;
            case 1:
                zv0 zv0Var2 = this.b;
                zv0Var2.getClass();
                zv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zv0 zv0Var3 = this.b;
                zv0Var3.getClass();
                zv0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zv0Var3.invalidate();
                break;
        }
    }
}
