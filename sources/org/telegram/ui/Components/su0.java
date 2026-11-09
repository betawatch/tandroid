package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class su0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu0 b;

    public /* synthetic */ su0(vu0 vu0Var, int i7) {
        this.a = i7;
        this.b = vu0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vu0 vu0Var = this.b;
                vu0Var.getClass();
                vu0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var.invalidate();
                break;
            case 1:
                vu0 vu0Var2 = this.b;
                vu0Var2.getClass();
                vu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                vu0 vu0Var3 = this.b;
                vu0Var3.getClass();
                vu0Var3.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var3.invalidate();
                break;
        }
    }
}
