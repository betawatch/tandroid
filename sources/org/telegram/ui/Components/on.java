package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class on extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo b;

    public /* synthetic */ on(lo loVar, int i10) {
        this.a = i10;
        this.b = loVar;
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
                lo loVar = this.b;
                loVar.f1 = false;
                loVar.E.setTranslationY(0.0f);
                loVar.d0();
                break;
        }
    }
}
