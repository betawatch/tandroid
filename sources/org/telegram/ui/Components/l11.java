package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m11 b;

    public /* synthetic */ l11(m11 m11Var, int i10) {
        this.a = i10;
        this.b = m11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m11 m11Var = this.b;
                m11Var.getClass();
                m11Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.invalidate();
                break;
            case 1:
                m11 m11Var2 = this.b;
                m11Var2.getClass();
                m11Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var2.invalidate();
                break;
            case 2:
                m11 m11Var3 = this.b;
                m11Var3.getClass();
                m11Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var3.invalidate();
                break;
            case 3:
                m11 m11Var4 = this.b;
                m11Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var4.s = floatValue;
                m11Var4.w = (int) ((m11Var4.h * floatValue) + 0);
                m11Var4.invalidate();
                break;
            default:
                m11 m11Var5 = this.b;
                m11Var5.getClass();
                m11Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var5.x = m11Var5.r + ((int) Math.ceil((m11Var5.n - r1) * r5));
                m11Var5.invalidate();
                break;
        }
    }
}
