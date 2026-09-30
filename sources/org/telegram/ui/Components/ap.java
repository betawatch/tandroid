package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
