package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ um(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.getClass();
                unVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                unVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
