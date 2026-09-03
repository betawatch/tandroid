package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ pv(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                pyVar.getClass();
                pyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                py pyVar2 = this.b;
                pyVar2.getClass();
                pyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
