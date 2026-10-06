package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class bp implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ pp b;

    public bp(pp ppVar) {
        this.b = ppVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        pp ppVar = this.b;
        ppVar.S = floatValue;
        ppVar.R.invalidate();
        if (this.a || ppVar.S <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
