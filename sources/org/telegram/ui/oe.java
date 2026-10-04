package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ oe(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yn ynVar = this.b;
                ynVar.I8 = floatValue;
                qm qmVar = ynVar.V0;
                if (qmVar != null) {
                    qmVar.invalidate();
                    ynVar.v0.invalidate();
                    break;
                }
                break;
            case 1:
                yn ynVar2 = this.b;
                ynVar2.getClass();
                ynVar2.g3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar2.kc();
                break;
            case 2:
                yn ynVar3 = this.b;
                ynVar3.getClass();
                ynVar3.g3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar3.kc();
                break;
            case 3:
                yn ynVar4 = this.b;
                ynVar4.getClass();
                ynVar4.Ba = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar4.o9();
                break;
            default:
                yn ynVar5 = this.b;
                ynVar5.getClass();
                ynVar5.Ba = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ynVar5.o9();
                break;
        }
    }
}
