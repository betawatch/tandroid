package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ oe(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zn znVar = this.b;
                znVar.K8 = floatValue;
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.invalidate();
                    znVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                znVar2.getClass();
                znVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar2.lc();
                break;
            case 2:
                zn znVar3 = this.b;
                znVar3.getClass();
                znVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar3.lc();
                break;
            case 3:
                zn znVar4 = this.b;
                znVar4.getClass();
                znVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar4.o9();
                break;
            default:
                zn znVar5 = this.b;
                znVar5.getClass();
                znVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar5.o9();
                break;
        }
    }
}
