package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e31 b;

    public /* synthetic */ b31(e31 e31Var, int i10) {
        this.a = i10;
        this.b = e31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e31 e31Var = this.b;
                e31Var.getClass();
                e31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.g();
                break;
            case 1:
                e31 e31Var2 = this.b;
                e31Var2.getClass();
                e31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var2.g();
                break;
            default:
                e31 e31Var3 = this.b;
                e31Var3.getClass();
                e31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var3.g();
                break;
        }
    }
}
