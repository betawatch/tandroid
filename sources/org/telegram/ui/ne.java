package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                xnVar.K8 = floatValue;
                qm qmVar = xnVar.X0;
                if (qmVar != null) {
                    qmVar.invalidate();
                    xnVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                xn xnVar2 = this.b;
                xnVar2.getClass();
                xnVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar2.lc();
                break;
            case 2:
                xn xnVar3 = this.b;
                xnVar3.getClass();
                xnVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar3.lc();
                break;
            case 3:
                xn xnVar4 = this.b;
                xnVar4.getClass();
                xnVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar4.o9();
                break;
            default:
                xn xnVar5 = this.b;
                xnVar5.getClass();
                xnVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar5.o9();
                break;
        }
    }
}
