package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ p00(q00 q00Var, int i3) {
        this.a = i3;
        this.b = q00Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q00 q00Var = this.b;
                org.telegram.messenger.hs.f(q00Var.r.a).j(q00Var.f);
                q00Var.requestLayout();
                break;
            default:
                q00 q00Var2 = this.b;
                q00Var2.d = null;
                q00Var2.a = null;
                q00Var2.b = false;
                break;
        }
    }
}
