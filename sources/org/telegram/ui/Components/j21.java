package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l21 b;

    public /* synthetic */ j21(l21 l21Var, int i10) {
        this.a = i10;
        this.b = l21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l21 l21Var = this.b;
                l21Var.getClass();
                l21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l21Var.h();
                l21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l21 l21Var2 = this.b;
                l21Var2.G = max;
                l21Var2.h.invalidate();
                break;
        }
    }
}
