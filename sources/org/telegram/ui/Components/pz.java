package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;

    public /* synthetic */ pz(rz rzVar, int i7) {
        this.a = i7;
        this.b = rzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                rzVar.getClass();
                rzVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar.invalidate();
                break;
            case 1:
                rz rzVar2 = this.b;
                rzVar2.getClass();
                rzVar2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                rzVar2.invalidate();
                break;
            default:
                rz rzVar3 = this.b;
                rzVar3.getClass();
                rzVar3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar3.invalidate();
                break;
        }
    }
}
