package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mx0 b;

    public /* synthetic */ jx0(mx0 mx0Var, int i10) {
        this.a = i10;
        this.b = mx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                mx0 mx0Var = this.b;
                mx0Var.getClass();
                mx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var.invalidate();
                break;
            case 1:
                mx0 mx0Var2 = this.b;
                mx0Var2.getClass();
                mx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                mx0 mx0Var3 = this.b;
                mx0Var3.getClass();
                mx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var3.invalidate();
                break;
        }
    }
}
