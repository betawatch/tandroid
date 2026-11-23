package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ u71(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.E = null;
                break;
            default:
                this.b.E = null;
                break;
        }
    }
}
