package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ v2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.getClass();
                w2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.a(w2Var.R, w2Var.S);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                w2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var2.invalidate();
                break;
        }
    }
}
