package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class i31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ i31(k31 k31Var, int i10) {
        this.a = i10;
        this.b = k31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k31 k31Var = this.b;
                k31Var.getClass();
                k31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.h();
                k31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k31 k31Var2 = this.b;
                k31Var2.K = max;
                k31Var2.h.invalidate();
                break;
        }
    }
}
