package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;

    public /* synthetic */ yf0(ag0 ag0Var, int i10) {
        this.a = i10;
        this.b = ag0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ag0 ag0Var = this.b;
                ag0Var.getClass();
                ag0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag0Var.invalidate();
                break;
            default:
                ag0 ag0Var2 = this.b;
                ag0Var2.getClass();
                ag0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag0Var2.invalidate();
                break;
        }
    }
}
