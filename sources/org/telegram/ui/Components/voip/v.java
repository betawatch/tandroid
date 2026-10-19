package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.m40;
import org.telegram.ui.q50;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ v(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                q50 q50Var = l0Var2.j0;
                q50Var.z1.setAlpha(1.0f - floatValue);
                m40 m40Var = q50Var.O;
                m40Var.setAlpha((1.0f - q50Var.a2.c) * (m40Var.getTag() != null ? 1.0f : 0.0f));
                q50Var.F1(q50Var.y0);
                l0Var2.l();
                break;
        }
    }
}
