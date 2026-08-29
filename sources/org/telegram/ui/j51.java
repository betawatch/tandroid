package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m51 b;

    public /* synthetic */ j51(m51 m51Var, int i10) {
        this.a = i10;
        this.b = m51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51 m51Var = this.b;
                m51Var.J = floatValue;
                m51Var.R.d0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51 m51Var2 = this.b;
                m51Var2.J = floatValue2;
                m51Var2.R.d0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51 m51Var3 = this.b;
                m51Var3.J = floatValue3;
                m51Var3.R.d0.invalidate();
                break;
        }
    }
}
