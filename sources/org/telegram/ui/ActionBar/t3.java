package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ t3(b4 b4Var, int i10) {
        this.a = i10;
        this.b = b4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.getClass();
                b4Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                break;
            case 1:
                b4 b4Var2 = this.b;
                b4Var2.getClass();
                b4Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var2.invalidate();
                break;
            default:
                b4 b4Var3 = this.b;
                b4Var3.getClass();
                b4Var3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
