package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oo implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ cp b;

    public oo(cp cpVar) {
        this.b = cpVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cp cpVar = this.b;
        cpVar.O = floatValue;
        cpVar.N.invalidate();
        if (this.a || cpVar.O <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
