package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    public /* synthetic */ ug(ki kiVar, int i9) {
        this.a = i9;
        this.b = kiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.b2();
                break;
            case 1:
                this.b.z0.invalidate();
                break;
            case 2:
                ki.m(this.b, valueAnimator);
                break;
            case 3:
                ki kiVar = this.b;
                kiVar.getClass();
                kiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.b2();
                break;
        }
    }
}
