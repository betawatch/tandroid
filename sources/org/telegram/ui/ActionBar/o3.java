package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ o3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.getClass();
                w3Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.invalidate();
                break;
            case 1:
                w3 w3Var2 = this.b;
                w3Var2.getClass();
                w3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var2.invalidate();
                break;
            default:
                w3 w3Var3 = this.b;
                w3Var3.getClass();
                w3Var3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
