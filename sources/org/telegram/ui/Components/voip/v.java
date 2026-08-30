package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.c60;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ v(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.getClass();
                k0Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.c = floatValue;
                c60 c60Var = k0Var2.g0;
                c60Var.w1.setAlpha(1.0f - floatValue);
                z40 z40Var = c60Var.L;
                z40Var.setAlpha((1.0f - c60Var.X1.c) * (z40Var.getTag() != null ? 1.0f : 0.0f));
                c60Var.E1(c60Var.v0);
                k0Var2.l();
                break;
        }
    }
}
