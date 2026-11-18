package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class av0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dv0 b;

    public /* synthetic */ av0(dv0 dv0Var, int i7) {
        this.a = i7;
        this.b = dv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dv0 dv0Var = this.b;
                dv0Var.getClass();
                dv0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dv0Var.invalidate();
                break;
            case 1:
                dv0 dv0Var2 = this.b;
                dv0Var2.getClass();
                dv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                dv0 dv0Var3 = this.b;
                dv0Var3.getClass();
                dv0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dv0Var3.invalidate();
                break;
        }
    }
}
