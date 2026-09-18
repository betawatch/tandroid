package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
