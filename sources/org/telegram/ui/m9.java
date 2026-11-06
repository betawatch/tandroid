package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
