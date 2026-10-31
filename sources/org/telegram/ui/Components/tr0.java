package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tr0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss0 b;
    public final /* synthetic */ zt0 c;

    public /* synthetic */ tr0(zt0 zt0Var, ss0 ss0Var, int i10) {
        this.a = i10;
        this.c = zt0Var;
        this.b = ss0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.c.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
            default:
                this.c.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.b.h.invalidate();
                break;
        }
    }
}
