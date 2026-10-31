package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ nm(jn jnVar, int i10) {
        this.a = i10;
        this.b = jnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                jnVar.getClass();
                jnVar.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                jn jnVar2 = this.b;
                jnVar2.getClass();
                jnVar2.E.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
