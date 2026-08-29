package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ l9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r9 r9Var = this.b;
                r9Var.T = floatValue;
                r9Var.a.setAlpha(1.0f - floatValue);
                if (r9Var.R == 3) {
                    r9Var.b.setAlpha(1.0f - r9Var.T);
                }
                r9Var.r.setAlpha(1.0f - r9Var.T);
                r9Var.v = (r9Var.T * 0.25f) + 0.5f;
                r9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
