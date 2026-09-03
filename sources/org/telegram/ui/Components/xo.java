package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xo implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ mp b;

    public xo(mp mpVar) {
        this.b = mpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mp mpVar = this.b;
        mpVar.P = floatValue;
        mpVar.O.invalidate();
        if (this.a || mpVar.P <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
