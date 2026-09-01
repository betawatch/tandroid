package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ne(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xn xnVar = this.b;
                xnVar.H8 = floatValue;
                pm pmVar = xnVar.U0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    xnVar.u0.invalidate();
                    break;
                }
                break;
            case 1:
                xn xnVar2 = this.b;
                xnVar2.getClass();
                xnVar2.f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.lc();
                break;
            case 2:
                xn xnVar3 = this.b;
                xnVar3.getClass();
                xnVar3.f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar3.lc();
                break;
            case 3:
                xn xnVar4 = this.b;
                xnVar4.getClass();
                xnVar4.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar4.o9();
                break;
            default:
                xn xnVar5 = this.b;
                xnVar5.getClass();
                xnVar5.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar5.o9();
                break;
        }
    }
}
