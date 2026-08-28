package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ lm(jn jnVar, int i9) {
        this.a = i9;
        this.b = jnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                jnVar.getClass();
                jnVar.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                jn jnVar2 = this.b;
                jnVar2.getClass();
                jnVar2.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
