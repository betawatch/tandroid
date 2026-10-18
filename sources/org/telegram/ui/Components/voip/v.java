package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.o40;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                s50 s50Var = l0Var2.j0;
                s50Var.z1.setAlpha(1.0f - floatValue);
                o40 o40Var = s50Var.O;
                o40Var.setAlpha((1.0f - s50Var.a2.c) * (o40Var.getTag() != null ? 1.0f : 0.0f));
                s50Var.F1(s50Var.y0);
                l0Var2.l();
                break;
        }
    }
}
