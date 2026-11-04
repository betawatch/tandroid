package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j31 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ n31 c;

    public j31(n31 n31Var, int i3) {
        this.c = n31Var;
        this.b = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        n31 n31Var = this.c;
        n31Var.O = true;
        n31Var.n.scrollBy(0, floatValue - this.a);
        n31Var.O = false;
        this.a = floatValue;
    }
}
