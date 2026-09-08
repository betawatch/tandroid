package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ s4(v4 v4Var, int i10) {
        this.a = i10;
        this.b = v4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 13));
                break;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new q(this, 14));
                break;
        }
    }
}
