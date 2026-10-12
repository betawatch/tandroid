package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
