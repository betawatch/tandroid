package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j51 b;

    public /* synthetic */ g51(j51 j51Var, int i10) {
        this.a = i10;
        this.b = j51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var = this.b;
                j51Var.J = floatValue;
                j51Var.R.d0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var2 = this.b;
                j51Var2.J = floatValue2;
                j51Var2.R.d0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51 j51Var3 = this.b;
                j51Var3.J = floatValue3;
                j51Var3.R.d0.invalidate();
                break;
        }
    }
}
