package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.o40;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
                k0Var.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.invalidate();
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var2.c = floatValue;
                s50 s50Var = k0Var2.f0;
                s50Var.v1.setAlpha(1.0f - floatValue);
                o40 o40Var = s50Var.K;
                o40Var.setAlpha((1.0f - s50Var.W1.c) * (o40Var.getTag() != null ? 1.0f : 0.0f));
                s50Var.E1(s50Var.u0);
                k0Var2.l();
                break;
        }
    }
}
