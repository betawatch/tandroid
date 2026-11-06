package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ m9(s9 s9Var, int i7) {
        this.a = i7;
        this.b = s9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.b;
                s9Var.Y = floatValue;
                s9Var.b.setAlpha(1.0f - floatValue);
                if (s9Var.W == 3) {
                    s9Var.c.setAlpha(1.0f - s9Var.Y);
                }
                s9Var.s.setAlpha(1.0f - s9Var.Y);
                s9Var.x = (s9Var.Y * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
