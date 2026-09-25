package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class q4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ q4(t4 t4Var, int i10) {
        this.a = i10;
        this.b = t4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 13));
                break;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new p(this, 14));
                break;
        }
    }
}
