package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn b;

    public /* synthetic */ ym(dn dnVar, int i10) {
        this.a = i10;
        this.b = dnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dn dnVar = this.b;
                dnVar.getClass();
                dnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dnVar.invalidate();
                break;
            default:
                dn dnVar2 = this.b;
                dnVar2.getClass();
                dnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dnVar2.invalidate();
                break;
        }
    }
}
