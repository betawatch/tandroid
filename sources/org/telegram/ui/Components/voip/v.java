package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.k40;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ v(k0 k0Var, int i9) {
        this.a = i9;
        this.b = k0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.getClass();
                k0Var.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.c = floatValue;
                o50 o50Var = k0Var2.f0;
                o50Var.v1.setAlpha(1.0f - floatValue);
                k40 k40Var = o50Var.K;
                k40Var.setAlpha((1.0f - o50Var.W1.c) * (k40Var.getTag() != null ? 1.0f : 0.0f));
                o50Var.E1(o50Var.u0);
                k0Var2.l();
                break;
        }
    }
}
