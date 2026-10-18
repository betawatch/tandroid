package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ ng0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                pg0Var.getClass();
                pg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var.invalidate();
                break;
            default:
                pg0 pg0Var2 = this.b;
                pg0Var2.getClass();
                pg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg0Var2.invalidate();
                break;
        }
    }
}
