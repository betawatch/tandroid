package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;

    public /* synthetic */ r00(y00 y00Var, int i10) {
        this.a = i10;
        this.b = y00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00 y00Var = this.b;
                y00Var.x = floatValue;
                y00Var.invalidate();
                break;
            default:
                y00 y00Var2 = this.b;
                y00Var2.getClass();
                y00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y00Var2.invalidate();
                break;
        }
    }
}
