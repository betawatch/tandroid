package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ j2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.getClass();
                v2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                break;
            case 1:
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                v2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                break;
            default:
                v2 v2Var3 = this.b;
                v2Var3.getClass();
                v2Var3.y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var3.invalidate();
                break;
        }
    }
}
