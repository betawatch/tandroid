package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ n9(u9 u9Var, int i10) {
        this.a = i10;
        this.b = u9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = this.b;
                u9Var.Y = floatValue;
                u9Var.b.setAlpha(1.0f - floatValue);
                if (u9Var.W == 3) {
                    u9Var.c.setAlpha(1.0f - u9Var.Y);
                }
                u9Var.s.setAlpha(1.0f - u9Var.Y);
                u9Var.x = (u9Var.Y * 0.25f) + 0.5f;
                u9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
