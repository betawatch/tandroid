package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm b;

    public /* synthetic */ mm(qm qmVar, int i7) {
        this.a = i7;
        this.b = qmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qm qmVar = this.b;
                qmVar.getClass();
                qmVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar.invalidate();
                break;
            default:
                qm qmVar2 = this.b;
                qmVar2.getClass();
                qmVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qmVar2.invalidate();
                break;
        }
    }
}
