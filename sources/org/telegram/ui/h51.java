package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ h51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var = this.b;
                k51Var.N = floatValue;
                k51Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var2 = this.b;
                k51Var2.N = floatValue2;
                k51Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51 k51Var3 = this.b;
                k51Var3.N = floatValue3;
                k51Var3.V.h0.invalidate();
                break;
        }
    }
}
