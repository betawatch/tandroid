package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ lv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                zx zxVar = this.b;
                zxVar.getClass();
                zxVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zx zxVar2 = this.b;
                zxVar2.getClass();
                zxVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
