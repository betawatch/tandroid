package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.j50;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                n60 n60Var = l0Var2.j0;
                n60Var.z1.setAlpha(1.0f - floatValue);
                j50 j50Var = n60Var.O;
                j50Var.setAlpha((1.0f - n60Var.a2.c) * (j50Var.getTag() != null ? 1.0f : 0.0f));
                n60Var.F1(n60Var.y0);
                l0Var2.l();
                break;
        }
    }
}
