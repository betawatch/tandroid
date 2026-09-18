package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm b;

    public /* synthetic */ km(pm pmVar, int i10) {
        this.a = i10;
        this.b = pmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pm pmVar = this.b;
                pmVar.getClass();
                pmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.invalidate();
                break;
            default:
                pm pmVar2 = this.b;
                pmVar2.getClass();
                pmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar2.invalidate();
                break;
        }
    }
}
