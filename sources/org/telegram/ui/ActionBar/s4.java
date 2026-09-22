package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
