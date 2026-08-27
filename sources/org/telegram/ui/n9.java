package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ n9(t9 t9Var, int i10) {
        this.a = i10;
        this.b = t9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = this.b;
                t9Var.T = floatValue;
                t9Var.a.setAlpha(1.0f - floatValue);
                if (t9Var.R == 3) {
                    t9Var.b.setAlpha(1.0f - t9Var.T);
                }
                t9Var.r.setAlpha(1.0f - t9Var.T);
                t9Var.v = (t9Var.T * 0.25f) + 0.5f;
                t9Var.fragmentView.invalidate();
                break;
            default:
                this.b.r.invalidate();
                break;
        }
    }
}
