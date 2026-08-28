package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a21 b;

    public /* synthetic */ x11(a21 a21Var, int i9) {
        this.a = i9;
        this.b = a21Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a21 a21Var = this.b;
                a21Var.getClass();
                a21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.h();
                a21Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a21 a21Var2 = this.b;
                a21Var2.G = max;
                a21Var2.h.invalidate();
                break;
        }
    }
}
