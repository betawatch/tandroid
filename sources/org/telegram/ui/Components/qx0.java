package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx0 b;

    public /* synthetic */ qx0(tx0 tx0Var, int i10) {
        this.a = i10;
        this.b = tx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tx0 tx0Var = this.b;
                tx0Var.getClass();
                tx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var.invalidate();
                break;
            case 1:
                tx0 tx0Var2 = this.b;
                tx0Var2.getClass();
                tx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                tx0 tx0Var3 = this.b;
                tx0Var3.getClass();
                tx0Var3.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var3.invalidate();
                break;
        }
    }
}
