package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g41 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ k41 c;

    public g41(k41 k41Var, int i7) {
        this.c = k41Var;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        k41 k41Var = this.c;
        k41Var.O = true;
        k41Var.n.scrollBy(0, floatValue - this.a);
        k41Var.O = false;
        this.a = floatValue;
    }
}
