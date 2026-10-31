package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ mv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.O4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ay ayVar = this.b;
                ayVar.getClass();
                ayVar.Q4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ay ayVar2 = this.b;
                ayVar2.getClass();
                ayVar2.K4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
