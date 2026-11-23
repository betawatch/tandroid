package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class k30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m30 b;

    public /* synthetic */ k30(m30 m30Var, int i7) {
        this.a = i7;
        this.b = m30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m30 m30Var = this.b;
                m30Var.d = null;
                oo ooVar = new oo(this, 22);
                m30Var.e = ooVar;
                org.telegram.messenger.g0.h3(ooVar, m30Var.w);
                break;
            default:
                m30 m30Var2 = this.b;
                m30Var2.setVisibility(4);
                m30Var2.c = null;
                m30Var2.d = null;
                break;
        }
    }
}
