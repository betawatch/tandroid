package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class j41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m41 b;

    public /* synthetic */ j41(m41 m41Var, int i10) {
        this.a = i10;
        this.b = m41Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m41 m41Var = this.b;
                m41Var.getClass();
                m41Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var.g();
                break;
            case 1:
                m41 m41Var2 = this.b;
                m41Var2.getClass();
                m41Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var2.g();
                break;
            default:
                m41 m41Var3 = this.b;
                m41Var3.getClass();
                m41Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m41Var3.g();
                break;
        }
    }
}
