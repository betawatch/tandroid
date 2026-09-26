package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh0 b;

    public /* synthetic */ ch0(fh0 fh0Var, int i10) {
        this.a = i10;
        this.b = fh0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fh0 fh0Var = this.b;
                fh0Var.getClass();
                fh0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fh0Var.c(true);
                break;
            default:
                fh0 fh0Var2 = this.b;
                fh0Var2.getClass();
                fh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fh0Var2.c(true);
                break;
        }
    }
}
