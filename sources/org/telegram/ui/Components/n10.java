package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o10 b;

    public /* synthetic */ n10(o10 o10Var, int i10) {
        this.a = i10;
        this.b = o10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o10 o10Var = this.b;
                o10Var.getClass();
                o10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o10Var.invalidate();
                break;
            case 1:
                o10 o10Var2 = this.b;
                o10Var2.getClass();
                o10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                o10Var2.invalidate();
                break;
            default:
                o10 o10Var3 = this.b;
                o10Var3.getClass();
                o10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o10Var3.invalidate();
                break;
        }
    }
}
