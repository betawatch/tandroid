package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm b;

    public /* synthetic */ lm(qm qmVar, int i10) {
        this.a = i10;
        this.b = qmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qm qmVar = this.b;
                qmVar.getClass();
                qmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.invalidate();
                break;
            default:
                qm qmVar2 = this.b;
                qmVar2.getClass();
                qmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar2.invalidate();
                break;
        }
    }
}
