package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ q9(w9 w9Var, int i10) {
        this.a = i10;
        this.b = w9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = this.b;
                w9Var.Y = floatValue;
                w9Var.b.setAlpha(1.0f - floatValue);
                if (w9Var.W == 3) {
                    w9Var.c.setAlpha(1.0f - w9Var.Y);
                }
                w9Var.s.setAlpha(1.0f - w9Var.Y);
                w9Var.w = (w9Var.Y * 0.25f) + 0.5f;
                w9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
