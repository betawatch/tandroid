package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
