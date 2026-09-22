package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class k31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ k31(m31 m31Var, int i10) {
        this.a = i10;
        this.b = m31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m31 m31Var = this.b;
                m31Var.getClass();
                m31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.h();
                m31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m31 m31Var2 = this.b;
                m31Var2.K = max;
                m31Var2.h.invalidate();
                break;
        }
    }
}
