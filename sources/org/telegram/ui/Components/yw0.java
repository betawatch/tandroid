package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx0 b;

    public /* synthetic */ yw0(bx0 bx0Var, int i10) {
        this.a = i10;
        this.b = bx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bx0 bx0Var = this.b;
                bx0Var.getClass();
                bx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bx0Var.invalidate();
                break;
            case 1:
                bx0 bx0Var2 = this.b;
                bx0Var2.getClass();
                bx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                bx0 bx0Var3 = this.b;
                bx0Var3.getClass();
                bx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bx0Var3.invalidate();
                break;
        }
    }
}
