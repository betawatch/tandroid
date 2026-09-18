package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ pe(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bo boVar = this.b;
                boVar.K8 = floatValue;
                tm tmVar = boVar.X0;
                if (tmVar != null) {
                    tmVar.invalidate();
                    boVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                bo boVar2 = this.b;
                boVar2.getClass();
                boVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar2.lc();
                break;
            case 2:
                bo boVar3 = this.b;
                boVar3.getClass();
                boVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar3.lc();
                break;
            case 3:
                bo boVar4 = this.b;
                boVar4.getClass();
                boVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar4.o9();
                break;
            default:
                bo boVar5 = this.b;
                boVar5.getClass();
                boVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar5.o9();
                break;
        }
    }
}
