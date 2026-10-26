package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x11 b;

    public /* synthetic */ w11(x11 x11Var, int i10) {
        this.a = i10;
        this.b = x11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x11 x11Var = this.b;
                x11Var.getClass();
                x11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var.invalidate();
                break;
            case 1:
                x11 x11Var2 = this.b;
                x11Var2.getClass();
                x11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var2.invalidate();
                break;
            case 2:
                x11 x11Var3 = this.b;
                x11Var3.getClass();
                x11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var3.invalidate();
                break;
            case 3:
                x11 x11Var4 = this.b;
                x11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var4.s = floatValue;
                x11Var4.w = (int) ((x11Var4.h * floatValue) + 0);
                x11Var4.invalidate();
                break;
            default:
                x11 x11Var5 = this.b;
                x11Var5.getClass();
                x11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var5.x = x11Var5.r + ((int) Math.ceil((x11Var5.n - r1) * r5));
                x11Var5.invalidate();
                break;
        }
    }
}
