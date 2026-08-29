package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g01 b;

    public /* synthetic */ f01(g01 g01Var, int i10) {
        this.a = i10;
        this.b = g01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g01 g01Var = this.b;
                g01Var.getClass();
                g01Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var.invalidate();
                break;
            case 1:
                g01 g01Var2 = this.b;
                g01Var2.getClass();
                g01Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var2.invalidate();
                break;
            case 2:
                g01 g01Var3 = this.b;
                g01Var3.getClass();
                g01Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var3.invalidate();
                break;
            case 3:
                g01 g01Var4 = this.b;
                g01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var4.s = floatValue;
                g01Var4.w = (int) ((g01Var4.h * floatValue) + 0);
                g01Var4.invalidate();
                break;
            default:
                g01 g01Var5 = this.b;
                g01Var5.getClass();
                g01Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g01Var5.x = g01Var5.r + ((int) Math.ceil((g01Var5.n - r1) * r5));
                g01Var5.invalidate();
                break;
        }
    }
}
