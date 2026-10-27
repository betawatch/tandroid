package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
