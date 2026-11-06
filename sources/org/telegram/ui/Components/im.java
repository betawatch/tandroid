package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class im extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ im(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
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
                bn bnVar = this.b;
                bnVar.f1 = false;
                bnVar.E.setTranslationY(0.0f);
                bnVar.f0();
                break;
        }
    }
}
