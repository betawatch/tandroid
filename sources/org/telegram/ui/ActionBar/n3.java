package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ n3(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v3 v3Var = this.b;
                v3Var.getClass();
                v3Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                break;
            case 1:
                v3 v3Var2 = this.b;
                v3Var2.getClass();
                v3Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.invalidate();
                break;
            default:
                v3 v3Var3 = this.b;
                v3Var3.getClass();
                v3Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
