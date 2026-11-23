package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ se0 b;

    public /* synthetic */ qe0(se0 se0Var, int i7) {
        this.a = i7;
        this.b = se0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                se0 se0Var = this.b;
                se0Var.getClass();
                se0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se0Var.invalidate();
                break;
            default:
                se0 se0Var2 = this.b;
                se0Var2.getClass();
                se0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se0Var2.invalidate();
                break;
        }
    }
}
