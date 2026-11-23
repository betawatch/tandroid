package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class j60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ j60(k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k60 k60Var = this.b;
                k60Var.e.Y1 = null;
                k60Var.requestLayout();
                break;
            default:
                k60 k60Var2 = this.b;
                k60Var2.e.Y1 = null;
                k60Var2.a = false;
                break;
        }
    }
}
