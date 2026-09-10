package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ o9(u9 u9Var, int i10) {
        this.a = i10;
        this.b = u9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.b;
                u9Var.X = floatValue;
                u9Var.a.setAlpha(1.0f - floatValue);
                if (u9Var.V == 3) {
                    u9Var.b.setAlpha(1.0f - u9Var.X);
                }
                u9Var.r.setAlpha(1.0f - u9Var.X);
                u9Var.v = (u9Var.X * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
