package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ap implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ op b;

    public ap(op opVar) {
        this.b = opVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        op opVar = this.b;
        opVar.S = floatValue;
        opVar.R.invalidate();
        if (this.a || opVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
