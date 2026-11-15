package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ nm(jn jnVar, int i7) {
        this.a = i7;
        this.b = jnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                jnVar.getClass();
                jnVar.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                jn jnVar2 = this.b;
                jnVar2.getClass();
                jnVar2.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
