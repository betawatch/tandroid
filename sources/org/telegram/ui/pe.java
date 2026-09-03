package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ pe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.b;
                znVar.H8 = floatValue;
                rm rmVar = znVar.U0;
                if (rmVar != null) {
                    rmVar.invalidate();
                    znVar.u0.invalidate();
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                znVar2.getClass();
                znVar2.f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.lc();
                break;
            case 2:
                zn znVar3 = this.b;
                znVar3.getClass();
                znVar3.f3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.lc();
                break;
            case 3:
                zn znVar4 = this.b;
                znVar4.getClass();
                znVar4.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.o9();
                break;
            default:
                zn znVar5 = this.b;
                znVar5.getClass();
                znVar5.Aa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.o9();
                break;
        }
    }
}
