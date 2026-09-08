package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
