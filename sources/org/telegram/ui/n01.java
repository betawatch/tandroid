package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q01 b;

    public /* synthetic */ n01(q01 q01Var, int i3) {
        this.a = i3;
        this.b = q01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q01 q01Var = this.b;
                q01Var.O = floatValue;
                q01Var.W.i0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q01 q01Var2 = this.b;
                q01Var2.O = floatValue2;
                q01Var2.W.i0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q01 q01Var3 = this.b;
                q01Var3.O = floatValue3;
                q01Var3.W.i0.invalidate();
                break;
        }
    }
}
