package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uo implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ jp b;

    public uo(jp jpVar) {
        this.b = jpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        jp jpVar = this.b;
        jpVar.P = floatValue;
        jpVar.O.invalidate();
        if (this.a || jpVar.P <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
