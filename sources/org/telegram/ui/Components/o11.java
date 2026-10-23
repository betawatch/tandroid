package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;

    public /* synthetic */ o11(p11 p11Var, int i10) {
        this.a = i10;
        this.b = p11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p11 p11Var = this.b;
                p11Var.getClass();
                p11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var.invalidate();
                break;
            case 1:
                p11 p11Var2 = this.b;
                p11Var2.getClass();
                p11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var2.invalidate();
                break;
            case 2:
                p11 p11Var3 = this.b;
                p11Var3.getClass();
                p11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var3.invalidate();
                break;
            case 3:
                p11 p11Var4 = this.b;
                p11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var4.s = floatValue;
                p11Var4.w = (int) ((p11Var4.h * floatValue) + 0);
                p11Var4.invalidate();
                break;
            default:
                p11 p11Var5 = this.b;
                p11Var5.getClass();
                p11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var5.x = p11Var5.r + ((int) Math.ceil((p11Var5.n - r1) * r5));
                p11Var5.invalidate();
                break;
        }
    }
}
