package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz b;

    public /* synthetic */ nz(tz tzVar, int i9) {
        this.a = i9;
        this.b = tzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tz tzVar = this.b;
                tzVar.x = floatValue;
                tzVar.invalidate();
                break;
            default:
                tz tzVar2 = this.b;
                tzVar2.getClass();
                tzVar2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tzVar2.invalidate();
                break;
        }
    }
}
