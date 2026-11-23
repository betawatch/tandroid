package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ k2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                u2Var.getClass();
                u2Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                break;
            case 1:
                u2 u2Var2 = this.b;
                u2Var2.getClass();
                u2Var2.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                break;
            default:
                u2 u2Var3 = this.b;
                u2Var3.getClass();
                u2Var3.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var3.invalidate();
                break;
        }
    }
}
