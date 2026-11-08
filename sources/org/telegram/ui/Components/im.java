package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
