package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z00 b;

    public /* synthetic */ y00(z00 z00Var, int i10) {
        this.a = i10;
        this.b = z00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z00 z00Var = this.b;
                z00Var.getClass();
                z00Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var.invalidate();
                break;
            case 1:
                z00 z00Var2 = this.b;
                z00Var2.getClass();
                z00Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                z00Var2.invalidate();
                break;
            default:
                z00 z00Var3 = this.b;
                z00Var3.getClass();
                z00Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z00Var3.invalidate();
                break;
        }
    }
}
