package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xp b;

    public pz(xp xpVar) {
        this.b = xpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((zz) this.b.d).m0.e();
                break;
            default:
                xp xpVar = this.b;
                View view = xpVar.b;
                view.setAlpha(1.0f);
                v4.o0.x0(view);
                ((zz) xpVar.d).b.removeView(view);
                break;
        }
    }

    public pz(xp xpVar, v4.o0 o0Var) {
        this.b = xpVar;
    }
}
