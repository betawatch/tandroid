package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;
    public final /* synthetic */ float c;

    public /* synthetic */ iv(zx zxVar, float f7, int i10) {
        this.a = i10;
        this.b = zxVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zx.a0(this.b, this.c, valueAnimator);
                break;
            default:
                zx.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
