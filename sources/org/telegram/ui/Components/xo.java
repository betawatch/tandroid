package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class xo implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ lp b;

    public xo(lp lpVar) {
        this.b = lpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lp lpVar = this.b;
        lpVar.S = floatValue;
        lpVar.R.invalidate();
        if (this.a || lpVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
