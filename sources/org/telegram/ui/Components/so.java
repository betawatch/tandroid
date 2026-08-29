package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class so implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ gp b;

    public so(gp gpVar) {
        this.b = gpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gp gpVar = this.b;
        gpVar.O = floatValue;
        gpVar.N.invalidate();
        if (this.a || gpVar.O <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
