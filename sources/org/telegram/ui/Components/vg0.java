package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ vg0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xg0 xg0Var = this.b;
                xg0Var.getClass();
                xg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var.invalidate();
                break;
            default:
                xg0 xg0Var2 = this.b;
                xg0Var2.getClass();
                xg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xg0Var2.invalidate();
                break;
        }
    }
}
