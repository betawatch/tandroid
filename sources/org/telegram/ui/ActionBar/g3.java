package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ g3(m3 m3Var, int i7) {
        this.a = i7;
        this.b = m3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                m3Var.getClass();
                m3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.invalidate();
                break;
            case 1:
                m3 m3Var2 = this.b;
                m3Var2.getClass();
                m3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                m3 m3Var3 = this.b;
                m3Var3.getClass();
                m3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var3.invalidate();
                break;
        }
    }
}
