package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu0 b;

    public /* synthetic */ ou0(xu0 xu0Var, int i9) {
        this.a = i9;
        this.b = xu0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xu0 xu0Var = this.b;
                xu0Var.getClass();
                xu0Var.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                xu0 xu0Var2 = this.b;
                xu0Var2.getClass();
                xu0Var2.N.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
