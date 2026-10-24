package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.p40;
import org.telegram.ui.u50;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                u50 u50Var = l0Var2.j0;
                u50Var.z1.setAlpha(1.0f - floatValue);
                p40 p40Var = u50Var.O;
                p40Var.setAlpha((1.0f - u50Var.a2.c) * (p40Var.getTag() != null ? 1.0f : 0.0f));
                u50Var.E1(u50Var.y0);
                l0Var2.l();
                break;
        }
    }
}
