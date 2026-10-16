package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ px0 b;

    public /* synthetic */ mx0(px0 px0Var, int i10) {
        this.a = i10;
        this.b = px0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                px0 px0Var = this.b;
                px0Var.getClass();
                px0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.invalidate();
                break;
            case 1:
                px0 px0Var2 = this.b;
                px0Var2.getClass();
                px0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                px0 px0Var3 = this.b;
                px0Var3.getClass();
                px0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var3.invalidate();
                break;
        }
    }
}
