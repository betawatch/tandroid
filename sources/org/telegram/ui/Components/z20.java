package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b30 b;

    public /* synthetic */ z20(b30 b30Var, int i7) {
        this.a = i7;
        this.b = b30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b30 b30Var = this.b;
                b30Var.d = null;
                fo foVar = new fo(this, 22);
                b30Var.e = foVar;
                org.telegram.messenger.g0.i3(foVar, b30Var.w);
                break;
            default:
                b30 b30Var2 = this.b;
                b30Var2.setVisibility(4);
                b30Var2.c = null;
                b30Var2.d = null;
                break;
        }
    }
}
