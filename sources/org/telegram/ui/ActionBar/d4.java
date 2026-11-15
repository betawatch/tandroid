package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ d4(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ns.f(m10.t0).d(new r0(this, 9));
                break;
            default:
                ns.f(m10.t0).d(new r0(this, 10));
                break;
        }
    }
}
