package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                mo moVar = new mo(this, 22);
                j30Var.e = moVar;
                org.telegram.messenger.g0.h3(moVar, j30Var.w);
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
