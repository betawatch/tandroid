package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c30;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                f40 f40Var = k0Var2.j0;
                f40Var.t3.setAlpha(1.0f - floatValue);
                c30 c30Var = f40Var.I1;
                c30Var.setAlpha((1.0f - f40Var.U3.c) * (c30Var.getTag() != null ? 1.0f : 0.0f));
                f40Var.J1(f40Var.s2);
                k0Var2.l();
                break;
        }
    }
}
