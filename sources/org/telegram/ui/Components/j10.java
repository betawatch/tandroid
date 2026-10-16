package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ j10(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k10 k10Var = this.b;
                k10Var.getClass();
                k10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var.invalidate();
                break;
            case 1:
                k10 k10Var2 = this.b;
                k10Var2.getClass();
                k10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k10Var2.invalidate();
                break;
            default:
                k10 k10Var3 = this.b;
                k10Var3.getClass();
                k10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k10Var3.invalidate();
                break;
        }
    }
}
