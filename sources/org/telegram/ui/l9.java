package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ l9(s9 s9Var, int i3) {
        this.a = i3;
        this.b = s9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s9 s9Var = this.b;
                s9Var.Z = floatValue;
                s9Var.b.setAlpha(1.0f - floatValue);
                if (s9Var.X == 3) {
                    s9Var.c.setAlpha(1.0f - s9Var.Z);
                }
                s9Var.s.setAlpha(1.0f - s9Var.Z);
                s9Var.x = (s9Var.Z * 0.25f) + 0.5f;
                s9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
