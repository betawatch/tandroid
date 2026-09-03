package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ tm(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                rnVar.getClass();
                rnVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                rn rnVar2 = this.b;
                rnVar2.getClass();
                rnVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
