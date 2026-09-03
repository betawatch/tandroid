package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b50;
import org.telegram.ui.e60;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                e60 e60Var = k0Var2.g0;
                e60Var.w1.setAlpha(1.0f - floatValue);
                b50 b50Var = e60Var.L;
                b50Var.setAlpha((1.0f - e60Var.X1.c) * (b50Var.getTag() != null ? 1.0f : 0.0f));
                e60Var.E1(e60Var.v0);
                k0Var2.l();
                break;
        }
    }
}
