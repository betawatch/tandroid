package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c40;
import org.telegram.ui.z20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ g0(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.getClass();
                k0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.c = floatValue;
                c40 c40Var = k0Var2.j0;
                c40Var.q3.setAlpha(1.0f - floatValue);
                z20 z20Var = c40Var.F1;
                z20Var.setAlpha((1.0f - c40Var.R3.c) * (z20Var.getTag() != null ? 1.0f : 0.0f));
                c40Var.J1(c40Var.p2);
                k0Var2.l();
                break;
        }
    }
}
