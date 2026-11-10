package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ hm(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
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
                an anVar = this.b;
                anVar.f1 = false;
                anVar.E.setTranslationY(0.0f);
                anVar.f0();
                break;
        }
    }
}
