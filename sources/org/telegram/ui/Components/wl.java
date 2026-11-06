package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
