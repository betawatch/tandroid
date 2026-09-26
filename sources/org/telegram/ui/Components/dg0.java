package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ dg0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.getClass();
                fg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.invalidate();
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.getClass();
                fg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.invalidate();
                break;
        }
    }
}
