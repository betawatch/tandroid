package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.d30;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                k0Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.c = floatValue;
                f40 f40Var = k0Var2.k0;
                f40Var.y3.setAlpha(1.0f - floatValue);
                d30 d30Var = f40Var.J1;
                d30Var.setAlpha((1.0f - f40Var.Z3.c) * (d30Var.getTag() != null ? 1.0f : 0.0f));
                f40Var.K1(f40Var.t2);
                k0Var2.l();
                break;
        }
    }
}
