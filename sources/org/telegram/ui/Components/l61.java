package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l61 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ p61 c;

    public l61(p61 p61Var, int i10) {
        this.c = p61Var;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        p61 p61Var = this.c;
        p61Var.N = true;
        p61Var.n.scrollBy(0, floatValue - this.a);
        p61Var.N = false;
        this.a = floatValue;
    }
}
