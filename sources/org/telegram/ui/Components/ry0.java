package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ry0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sy0 b;

    public /* synthetic */ ry0(sy0 sy0Var, int i3) {
        this.a = i3;
        this.b = sy0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sy0 sy0Var = this.b;
                sy0Var.getClass();
                sy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.invalidate();
                break;
            case 1:
                sy0 sy0Var2 = this.b;
                sy0Var2.getClass();
                sy0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var2.invalidate();
                break;
            case 2:
                sy0 sy0Var3 = this.b;
                sy0Var3.getClass();
                sy0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var3.invalidate();
                break;
            case 3:
                sy0 sy0Var4 = this.b;
                sy0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var4.s = floatValue;
                sy0Var4.x = (int) ((sy0Var4.h * floatValue) + 0);
                sy0Var4.invalidate();
                break;
            default:
                sy0 sy0Var5 = this.b;
                sy0Var5.getClass();
                sy0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var5.y = sy0Var5.r + ((int) Math.ceil((sy0Var5.n - r1) * r5));
                sy0Var5.invalidate();
                break;
        }
    }
}
