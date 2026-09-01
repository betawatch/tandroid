package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;

    public /* synthetic */ d00(j00 j00Var, int i10) {
        this.a = i10;
        this.b = j00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00 j00Var = this.b;
                j00Var.x = floatValue;
                j00Var.invalidate();
                break;
            default:
                j00 j00Var2 = this.b;
                j00Var2.getClass();
                j00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j00Var2.invalidate();
                break;
        }
    }
}
