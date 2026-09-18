package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ p9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = this.b;
                v9Var.X = floatValue;
                v9Var.a.setAlpha(1.0f - floatValue);
                if (v9Var.V == 3) {
                    v9Var.b.setAlpha(1.0f - v9Var.X);
                }
                v9Var.r.setAlpha(1.0f - v9Var.X);
                v9Var.v = (v9Var.X * 0.25f) + 0.5f;
                v9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
