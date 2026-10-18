package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5 b;

    public /* synthetic */ z3(n5 n5Var, int i10) {
        this.a = i10;
        this.b = n5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n5 n5Var = this.b;
                n5Var.getClass();
                n5Var.G0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n5 n5Var2 = this.b;
                n5Var2.getClass();
                n5Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var2.M0();
                break;
        }
    }
}
