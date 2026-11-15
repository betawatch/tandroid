package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ak extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.xp b;

    public ak(org.telegram.ui.xp xpVar) {
        this.b = xpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ck) this.b.d).V.e();
                break;
            default:
                org.telegram.ui.xp xpVar = this.b;
                View view = xpVar.b;
                view.setAlpha(1.0f);
                v4.o0.x0(view);
                ((ck) xpVar.d).Y.r.removeView(view);
                break;
        }
    }

    public ak(org.telegram.ui.xp xpVar, v4.o0 o0Var) {
        this.b = xpVar;
    }
}
