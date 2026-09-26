package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ h2(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                s2Var.getClass();
                s2Var.R3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.invalidate();
                break;
            case 1:
                s2 s2Var2 = this.b;
                s2Var2.getClass();
                s2Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var2.invalidate();
                break;
            default:
                s2 s2Var3 = this.b;
                s2Var3.getClass();
                s2Var3.u4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var3.invalidate();
                break;
        }
    }
}
