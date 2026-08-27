package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ ie(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar = this.b;
                rnVar.G8 = floatValue;
                jm jmVar = rnVar.T0;
                if (jmVar != null) {
                    jmVar.invalidate();
                    rnVar.t0.invalidate();
                    break;
                }
                break;
            case 1:
                rn rnVar2 = this.b;
                rnVar2.getClass();
                rnVar2.e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar2.lc();
                break;
            case 2:
                rn rnVar3 = this.b;
                rnVar3.getClass();
                rnVar3.e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar3.lc();
                break;
            case 3:
                rn rnVar4 = this.b;
                rnVar4.getClass();
                rnVar4.za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar4.o9();
                break;
            default:
                rn rnVar5 = this.b;
                rnVar5.getClass();
                rnVar5.za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar5.o9();
                break;
        }
    }
}
