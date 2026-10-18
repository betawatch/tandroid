package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ q9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.b;
                y9Var.a0 = floatValue;
                y9Var.b.setAlpha(1.0f - floatValue);
                if (y9Var.Y == 3) {
                    y9Var.c.setAlpha(1.0f - y9Var.a0);
                }
                y9Var.v.setAlpha(1.0f - y9Var.a0);
                y9Var.x = (y9Var.a0 * 0.25f) + 0.5f;
                y9Var.fragmentView.invalidate();
                break;
            default:
                this.b.v.invalidate();
                break;
        }
    }
}
