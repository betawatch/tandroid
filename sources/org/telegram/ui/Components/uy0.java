package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy0 b;

    public /* synthetic */ uy0(vy0 vy0Var, int i7) {
        this.a = i7;
        this.b = vy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vy0 vy0Var = this.b;
                vy0Var.getClass();
                vy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var.invalidate();
                break;
            case 1:
                vy0 vy0Var2 = this.b;
                vy0Var2.getClass();
                vy0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var2.invalidate();
                break;
            case 2:
                vy0 vy0Var3 = this.b;
                vy0Var3.getClass();
                vy0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var3.invalidate();
                break;
            case 3:
                vy0 vy0Var4 = this.b;
                vy0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var4.s = floatValue;
                vy0Var4.x = (int) ((vy0Var4.h * floatValue) + 0);
                vy0Var4.invalidate();
                break;
            default:
                vy0 vy0Var5 = this.b;
                vy0Var5.getClass();
                vy0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vy0Var5.y = vy0Var5.r + ((int) Math.ceil((vy0Var5.n - r1) * r5));
                vy0Var5.invalidate();
                break;
        }
    }
}
