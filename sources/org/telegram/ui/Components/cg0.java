package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ cg0(fg0 fg0Var, int i9) {
        this.a = i9;
        this.b = fg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                fg0Var.getClass();
                fg0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.c(true);
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.getClass();
                fg0Var2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.c(true);
                break;
        }
    }
}
