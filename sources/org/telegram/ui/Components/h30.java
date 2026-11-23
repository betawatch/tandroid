package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j30 b;

    public /* synthetic */ h30(j30 j30Var, int i7) {
        this.a = i7;
        this.b = j30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j30 j30Var = this.b;
                j30Var.d = null;
                lo loVar = new lo(this, 22);
                j30Var.e = loVar;
                org.telegram.messenger.g0.h3(loVar, j30Var.w);
                break;
            default:
                j30 j30Var2 = this.b;
                j30Var2.setVisibility(4);
                j30Var2.c = null;
                j30Var2.d = null;
                break;
        }
    }
}
