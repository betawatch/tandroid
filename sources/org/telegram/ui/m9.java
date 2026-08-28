package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ m9(s9 s9Var, int i9) {
        this.a = i9;
        this.b = s9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.b;
                s9Var.T = floatValue;
                s9Var.a.setAlpha(1.0f - floatValue);
                if (s9Var.R == 3) {
                    s9Var.b.setAlpha(1.0f - s9Var.T);
                }
                s9Var.r.setAlpha(1.0f - s9Var.T);
                s9Var.v = (s9Var.T * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
