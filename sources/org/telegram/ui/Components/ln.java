package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ln extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ ln(io ioVar, int i10) {
        this.a = i10;
        this.b = ioVar;
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
                io ioVar = this.b;
                ioVar.f1 = false;
                ioVar.E.setTranslationY(0.0f);
                ioVar.d0();
                break;
        }
    }
}
