package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b30;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                e40 e40Var = k0Var2.j0;
                e40Var.q3.setAlpha(1.0f - floatValue);
                b30 b30Var = e40Var.F1;
                b30Var.setAlpha((1.0f - e40Var.R3.c) * (b30Var.getTag() != null ? 1.0f : 0.0f));
                e40Var.J1(e40Var.p2);
                k0Var2.l();
                break;
        }
    }
}
