package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class op implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ cq b;

    public op(cq cqVar) {
        this.b = cqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cq cqVar = this.b;
        cqVar.S = floatValue;
        cqVar.R.invalidate();
        if (this.a || cqVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
