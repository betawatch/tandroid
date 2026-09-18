package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.g50;
import org.telegram.ui.k60;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ w(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.c = floatValue;
                k60 k60Var = m0Var2.j0;
                k60Var.z1.setAlpha(1.0f - floatValue);
                g50 g50Var = k60Var.O;
                g50Var.setAlpha((1.0f - k60Var.a2.c) * (g50Var.getTag() != null ? 1.0f : 0.0f));
                k60Var.E1(k60Var.y0);
                m0Var2.l();
                break;
        }
    }
}
