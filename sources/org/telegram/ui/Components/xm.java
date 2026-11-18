package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ xm(rn rnVar, int i7) {
        this.a = i7;
        this.b = rnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.F.setTranslationY(0.0f);
                break;
            case 1:
                this.b.F.setTranslationY(0.0f);
                break;
            default:
                rn rnVar = this.b;
                rnVar.g1 = false;
                rnVar.F.setTranslationY(0.0f);
                rnVar.f0();
                break;
        }
    }
}
