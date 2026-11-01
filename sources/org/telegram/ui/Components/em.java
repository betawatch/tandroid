package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class em implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ im b;

    public /* synthetic */ em(im imVar, int i10) {
        this.a = i10;
        this.b = imVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                im imVar = this.b;
                imVar.getClass();
                imVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar.invalidate();
                break;
            default:
                im imVar2 = this.b;
                imVar2.getClass();
                imVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar2.invalidate();
                break;
        }
    }
}
