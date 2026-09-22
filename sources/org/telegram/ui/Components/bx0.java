package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex0 b;

    public /* synthetic */ bx0(ex0 ex0Var, int i10) {
        this.a = i10;
        this.b = ex0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ex0 ex0Var = this.b;
                ex0Var.getClass();
                ex0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0Var.invalidate();
                break;
            case 1:
                ex0 ex0Var2 = this.b;
                ex0Var2.getClass();
                ex0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ex0 ex0Var3 = this.b;
                ex0Var3.getClass();
                ex0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0Var3.invalidate();
                break;
        }
    }
}
