package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h31 b;

    public /* synthetic */ e31(h31 h31Var, int i9) {
        this.a = i9;
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
