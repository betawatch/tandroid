package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ wm(bn bnVar, int i10) {
        this.a = i10;
        this.b = bnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.getClass();
                bnVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.invalidate();
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                bnVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.invalidate();
                break;
        }
    }
}
