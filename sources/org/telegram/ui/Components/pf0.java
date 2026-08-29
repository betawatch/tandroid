package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ pf0(rf0 rf0Var, int i10) {
        this.a = i10;
        this.b = rf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rf0 rf0Var = this.b;
                rf0Var.getClass();
                rf0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf0Var.invalidate();
                break;
            default:
                rf0 rf0Var2 = this.b;
                rf0Var2.getClass();
                rf0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf0Var2.invalidate();
                break;
        }
    }
}
