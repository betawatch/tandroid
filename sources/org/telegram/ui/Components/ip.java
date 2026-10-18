package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ip implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ wp b;

    public ip(wp wpVar) {
        this.b = wpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wp wpVar = this.b;
        wpVar.S = floatValue;
        wpVar.R.invalidate();
        if (this.a || wpVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
