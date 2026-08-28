package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ie(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn qnVar = this.b;
                qnVar.G8 = floatValue;
                im imVar = qnVar.T0;
                if (imVar != null) {
                    imVar.invalidate();
                    qnVar.t0.invalidate();
                    break;
                }
                break;
            case 1:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                qnVar2.e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar2.lc();
                break;
            case 2:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                qnVar3.e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar3.lc();
                break;
            case 3:
                qn qnVar4 = this.b;
                qnVar4.getClass();
                qnVar4.za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar4.o9();
                break;
            default:
                qn qnVar5 = this.b;
                qnVar5.getClass();
                qnVar5.za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar5.o9();
                break;
        }
    }
}
