package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ um(rn rnVar, int i7) {
        this.a = i7;
        this.b = rnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                rnVar.getClass();
                rnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                rn rnVar2 = this.b;
                rnVar2.getClass();
                rnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
