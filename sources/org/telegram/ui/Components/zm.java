package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
