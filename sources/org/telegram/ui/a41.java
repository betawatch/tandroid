package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ a41(d41 d41Var, int i10) {
        this.a = i10;
        this.b = d41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b;
                d41Var.getClass();
                d41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.g();
                break;
            case 1:
                d41 d41Var2 = this.b;
                d41Var2.getClass();
                d41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var2.g();
                break;
            default:
                d41 d41Var3 = this.b;
                d41Var3.getClass();
                d41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var3.g();
                break;
        }
    }
}
