package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ fm(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.getClass();
                bnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                bnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
