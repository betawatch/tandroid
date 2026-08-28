package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef0 b;

    public /* synthetic */ cf0(ef0 ef0Var, int i9) {
        this.a = i9;
        this.b = ef0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ef0 ef0Var = this.b;
                ef0Var.getClass();
                ef0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ef0Var.invalidate();
                break;
            default:
                ef0 ef0Var2 = this.b;
                ef0Var2.getClass();
                ef0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ef0Var2.invalidate();
                break;
        }
    }
}
