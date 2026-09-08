package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ xm(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
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
                tn tnVar = this.b;
                tnVar.f1 = false;
                tnVar.E.setTranslationY(0.0f);
                tnVar.a0();
                break;
        }
    }
}
