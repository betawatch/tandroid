package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;
    public final /* synthetic */ float c;

    public /* synthetic */ gu(ww wwVar, float f10, int i7) {
        this.a = i7;
        this.b = wwVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ww.a0(this.b, this.c, valueAnimator);
                break;
            default:
                ww.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
