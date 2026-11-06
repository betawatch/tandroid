package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ ju(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ww wwVar = this.b;
                wwVar.getClass();
                wwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ww wwVar2 = this.b;
                wwVar2.getClass();
                wwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
