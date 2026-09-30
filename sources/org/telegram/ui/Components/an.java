package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class an extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ an(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
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
                wn wnVar = this.b;
                wnVar.f1 = false;
                wnVar.E.setTranslationY(0.0f);
                wnVar.a0();
                break;
        }
    }
}
