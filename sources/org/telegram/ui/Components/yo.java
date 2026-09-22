package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class yo implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ mp b;

    public yo(mp mpVar) {
        this.b = mpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        mp mpVar = this.b;
        mpVar.S = floatValue;
        mpVar.R.invalidate();
        if (this.a || mpVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
