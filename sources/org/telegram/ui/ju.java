package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ ju(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ww wwVar = this.b;
                wwVar.getClass();
                wwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ww wwVar2 = this.b;
                wwVar2.getClass();
                wwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
