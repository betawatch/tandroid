package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ lu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                cx cxVar = this.b;
                cxVar.getClass();
                cxVar.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cx cxVar2 = this.b;
                cxVar2.getClass();
                cxVar2.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
