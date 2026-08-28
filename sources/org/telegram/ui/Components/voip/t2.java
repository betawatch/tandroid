package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ t2(u2 u2Var, int i9) {
        this.a = i9;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                u2Var.getClass();
                u2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.a(u2Var.N, u2Var.O);
                break;
            default:
                u2 u2Var2 = this.b;
                u2Var2.getClass();
                u2Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                break;
        }
    }
}
