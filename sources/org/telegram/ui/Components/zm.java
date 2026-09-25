package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn b;

    public /* synthetic */ zm(vn vnVar, int i10) {
        this.a = i10;
        this.b = vnVar;
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
                vn vnVar = this.b;
                vnVar.f1 = false;
                vnVar.E.setTranslationY(0.0f);
                vnVar.a0();
                break;
        }
    }
}
