package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
