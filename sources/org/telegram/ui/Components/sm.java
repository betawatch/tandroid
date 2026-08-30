package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ sm(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                qnVar.getClass();
                qnVar.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                qnVar2.B.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
