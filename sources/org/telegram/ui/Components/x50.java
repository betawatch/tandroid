package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z50 b;

    public /* synthetic */ x50(z50 z50Var, int i7) {
        this.a = i7;
        this.b = z50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z50 z50Var = this.b;
                z50Var.e.Y1 = null;
                z50Var.requestLayout();
                break;
            default:
                z50 z50Var2 = this.b;
                z50Var2.e.Y1 = null;
                z50Var2.a = false;
                break;
        }
    }
}
