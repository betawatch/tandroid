package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ fv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                dyVar.getClass();
                dyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                dy dyVar2 = this.b;
                dyVar2.getClass();
                dyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
