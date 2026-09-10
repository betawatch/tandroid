package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class z01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a11 b;

    public /* synthetic */ z01(a11 a11Var, int i10) {
        this.a = i10;
        this.b = a11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a11 a11Var = this.b;
                a11Var.getClass();
                a11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var.invalidate();
                break;
            case 1:
                a11 a11Var2 = this.b;
                a11Var2.getClass();
                a11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var2.invalidate();
                break;
            case 2:
                a11 a11Var3 = this.b;
                a11Var3.getClass();
                a11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var3.invalidate();
                break;
            case 3:
                a11 a11Var4 = this.b;
                a11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var4.s = floatValue;
                a11Var4.w = (int) ((a11Var4.h * floatValue) + 0);
                a11Var4.invalidate();
                break;
            default:
                a11 a11Var5 = this.b;
                a11Var5.getClass();
                a11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var5.x = a11Var5.r + ((int) Math.ceil((a11Var5.n - r1) * r5));
                a11Var5.invalidate();
                break;
        }
    }
}
