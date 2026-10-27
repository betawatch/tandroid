package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.t40;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                x50 x50Var = l0Var2.j0;
                x50Var.z1.setAlpha(1.0f - floatValue);
                t40 t40Var = x50Var.O;
                t40Var.setAlpha((1.0f - x50Var.a2.c) * (t40Var.getTag() != null ? 1.0f : 0.0f));
                x50Var.E1(x50Var.y0);
                l0Var2.l();
                break;
        }
    }
}
