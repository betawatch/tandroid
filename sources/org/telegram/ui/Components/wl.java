package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ am b;

    public /* synthetic */ wl(am amVar, int i7) {
        this.a = i7;
        this.b = amVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                am amVar = this.b;
                amVar.getClass();
                amVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                amVar.invalidate();
                break;
            default:
                am amVar2 = this.b;
                amVar2.getClass();
                amVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                amVar2.invalidate();
                break;
        }
    }
}
