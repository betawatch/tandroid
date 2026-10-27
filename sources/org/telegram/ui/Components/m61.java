package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m61 implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ q61 c;

    public m61(q61 q61Var, int i10) {
        this.c = q61Var;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
        q61 q61Var = this.c;
        q61Var.N = true;
        q61Var.n.scrollBy(0, floatValue - this.a);
        q61Var.N = false;
        this.a = floatValue;
    }
}
