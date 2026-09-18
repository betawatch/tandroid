package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ j31(l31 l31Var, int i10) {
        this.a = i10;
        this.b = l31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l31 l31Var = this.b;
                l31Var.getClass();
                l31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.h();
                l31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l31 l31Var2 = this.b;
                l31Var2.K = max;
                l31Var2.h.invalidate();
                break;
        }
    }
}
