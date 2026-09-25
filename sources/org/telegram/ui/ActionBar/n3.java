package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
