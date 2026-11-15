package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ m9(t9 t9Var, int i7) {
        this.a = i7;
        this.b = t9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.b;
                t9Var.Z = floatValue;
                t9Var.b.setAlpha(1.0f - floatValue);
                if (t9Var.X == 3) {
                    t9Var.c.setAlpha(1.0f - t9Var.Z);
                }
                t9Var.s.setAlpha(1.0f - t9Var.Z);
                t9Var.x = (t9Var.Z * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                break;
            default:
                this.b.s.invalidate();
                break;
        }
    }
}
