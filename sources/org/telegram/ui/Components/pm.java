package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;

    public /* synthetic */ pm(on onVar, int i10) {
        this.a = i10;
        this.b = onVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                on onVar = this.b;
                onVar.getClass();
                onVar.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                on onVar2 = this.b;
                onVar2.getClass();
                onVar2.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
