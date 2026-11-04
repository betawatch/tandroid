package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ c3(j3 j3Var, int i3) {
        this.a = i3;
        this.b = j3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j3 j3Var = this.b;
                j3Var.getClass();
                j3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var.invalidate();
                break;
            case 1:
                j3 j3Var2 = this.b;
                j3Var2.getClass();
                j3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                j3 j3Var3 = this.b;
                j3Var3.getClass();
                j3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j3Var3.invalidate();
                break;
        }
    }
}
