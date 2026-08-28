package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v11 b;

    public /* synthetic */ t11(v11 v11Var, int i9) {
        this.a = i9;
        this.b = v11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ih.b3 b3Var = this.b.f;
                b3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                b3Var.invalidate();
                break;
            default:
                v11 v11Var = this.b;
                v11Var.getClass();
                v11Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v11Var.h();
                break;
        }
    }
}
