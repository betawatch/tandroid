package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ h51(k51 k51Var, int i9) {
        this.a = i9;
        this.b = k51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var = this.b;
                k51Var.J = floatValue;
                k51Var.R.d0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var2 = this.b;
                k51Var2.J = floatValue2;
                k51Var2.R.d0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var3 = this.b;
                k51Var3.J = floatValue3;
                k51Var3.R.d0.invalidate();
                break;
        }
    }
}
