package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ g4(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ls.f(k10.t0).d(new oi.c2(this, 13));
                break;
            default:
                ls.f(k10.t0).d(new oi.c2(this, 14));
                break;
        }
    }
}
