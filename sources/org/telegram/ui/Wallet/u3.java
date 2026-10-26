package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ u3(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                m5Var.getClass();
                m5Var.I0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                m5 m5Var2 = this.b;
                m5Var2.getClass();
                m5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var2.P0();
                break;
        }
    }
}
