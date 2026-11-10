package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zl b;

    public /* synthetic */ vl(zl zlVar, int i7) {
        this.a = i7;
        this.b = zlVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zl zlVar = this.b;
                zlVar.getClass();
                zlVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar.invalidate();
                break;
            default:
                zl zlVar2 = this.b;
                zlVar2.getClass();
                zlVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar2.invalidate();
                break;
        }
    }
}
