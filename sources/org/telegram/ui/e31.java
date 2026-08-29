package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h31 b;

    public /* synthetic */ e31(h31 h31Var, int i10) {
        this.a = i10;
        this.b = h31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h31 h31Var = this.b;
                h31Var.getClass();
                h31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var.g();
                break;
            case 1:
                h31 h31Var2 = this.b;
                h31Var2.getClass();
                h31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var2.g();
                break;
            default:
                h31 h31Var3 = this.b;
                h31Var3.getClass();
                h31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h31Var3.g();
                break;
        }
    }
}
