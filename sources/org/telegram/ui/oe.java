package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ oe(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                co coVar = this.b;
                coVar.K8 = floatValue;
                um umVar = coVar.X0;
                if (umVar != null) {
                    umVar.invalidate();
                    coVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                co coVar2 = this.b;
                coVar2.getClass();
                coVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar2.lc();
                break;
            case 2:
                co coVar3 = this.b;
                coVar3.getClass();
                coVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar3.lc();
                break;
            case 3:
                co coVar4 = this.b;
                coVar4.getClass();
                coVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar4.o9();
                break;
            default:
                co coVar5 = this.b;
                coVar5.getClass();
                coVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                coVar5.o9();
                break;
        }
    }
}
