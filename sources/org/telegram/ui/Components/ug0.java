package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ ug0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wg0 wg0Var = this.b;
                wg0Var.getClass();
                wg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var.invalidate();
                break;
            default:
                wg0 wg0Var2 = this.b;
                wg0Var2.getClass();
                wg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg0Var2.invalidate();
                break;
        }
    }
}
