package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ ge(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar = this.b;
                tnVar.G8 = floatValue;
                km kmVar = tnVar.T0;
                if (kmVar != null) {
                    kmVar.invalidate();
                    tnVar.t0.invalidate();
                    break;
                }
                break;
            case 1:
                tn tnVar2 = this.b;
                tnVar2.getClass();
                tnVar2.e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar2.lc();
                break;
            case 2:
                tn tnVar3 = this.b;
                tnVar3.getClass();
                tnVar3.e3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar3.lc();
                break;
            case 3:
                tn tnVar4 = this.b;
                tnVar4.getClass();
                tnVar4.za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar4.o9();
                break;
            default:
                tn tnVar5 = this.b;
                tnVar5.getClass();
                tnVar5.za = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar5.o9();
                break;
        }
    }
}
