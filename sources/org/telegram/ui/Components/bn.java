package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ bn(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.E.setTranslationY(0.0f);
                break;
            case 1:
                this.b.E.setTranslationY(0.0f);
                break;
            default:
                xn xnVar = this.b;
                xnVar.f1 = false;
                xnVar.E.setTranslationY(0.0f);
                xnVar.Z();
                break;
        }
    }
}
