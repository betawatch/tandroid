package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ep implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ sp b;

    public ep(sp spVar) {
        this.b = spVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sp spVar = this.b;
        spVar.S = floatValue;
        spVar.R.invalidate();
        if (this.a || spVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
