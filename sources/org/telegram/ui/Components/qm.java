package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ qm(jn jnVar, int i10) {
        this.a = i10;
        this.b = jnVar;
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
                jn jnVar = this.b;
                jnVar.f1 = false;
                jnVar.E.setTranslationY(0.0f);
                jnVar.d0();
                break;
        }
    }
}
