package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c50;
import org.telegram.ui.g60;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
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
                g60 g60Var = m0Var2.j0;
                g60Var.z1.setAlpha(1.0f - floatValue);
                c50 c50Var = g60Var.O;
                c50Var.setAlpha((1.0f - g60Var.a2.c) * (c50Var.getTag() != null ? 1.0f : 0.0f));
                g60Var.F1(g60Var.y0);
                m0Var2.l();
                break;
        }
    }
}
