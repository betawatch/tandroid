package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j10 b;

    public /* synthetic */ h10(j10 j10Var, int i10) {
        this.a = i10;
        this.b = j10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j10 j10Var = this.b;
                j10Var.getClass();
                j10Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j10Var.invalidate();
                break;
            case 1:
                j10 j10Var2 = this.b;
                j10Var2.getClass();
                j10Var2.v = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                j10Var2.invalidate();
                break;
            default:
                j10 j10Var3 = this.b;
                j10Var3.getClass();
                j10Var3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j10Var3.invalidate();
                break;
        }
    }
}
