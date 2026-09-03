package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ rm(pn pnVar, int i10) {
        this.a = i10;
        this.b = pnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pn pnVar = this.b;
                pnVar.getClass();
                pnVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                pn pnVar2 = this.b;
                pnVar2.getClass();
                pnVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
