package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t31 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ x31 c;

    public t31(x31 x31Var, int i7) {
        this.c = x31Var;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        x31 x31Var = this.c;
        x31Var.O = true;
        x31Var.n.scrollBy(0, floatValue - this.a);
        x31Var.O = false;
        this.a = floatValue;
    }
}
