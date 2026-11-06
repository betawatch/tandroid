package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;

    public /* synthetic */ xy(cz czVar, int i7) {
        this.a = i7;
        this.b = czVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz czVar = this.b;
                czVar.y = floatValue;
                czVar.invalidate();
                break;
            default:
                cz czVar2 = this.b;
                czVar2.getClass();
                czVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                czVar2.invalidate();
                break;
        }
    }
}
