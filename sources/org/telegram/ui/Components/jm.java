package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ om b;

    public /* synthetic */ jm(om omVar, int i10) {
        this.a = i10;
        this.b = omVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                om omVar = this.b;
                omVar.getClass();
                omVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar.invalidate();
                break;
            default:
                om omVar2 = this.b;
                omVar2.getClass();
                omVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                omVar2.invalidate();
                break;
        }
    }
}
