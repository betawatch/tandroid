package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
