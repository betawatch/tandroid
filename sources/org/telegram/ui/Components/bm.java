package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gm b;

    public /* synthetic */ bm(gm gmVar, int i9) {
        this.a = i9;
        this.b = gmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gm gmVar = this.b;
                gmVar.getClass();
                gmVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar.invalidate();
                break;
            default:
                gm gmVar2 = this.b;
                gmVar2.getClass();
                gmVar2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar2.invalidate();
                break;
        }
    }
}
