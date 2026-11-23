package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ j2(k2 k2Var, int i7) {
        this.a = i7;
        this.b = k2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.setVisibility(8);
                break;
            default:
                this.b.c.setVisibility(8);
                break;
        }
    }
}
