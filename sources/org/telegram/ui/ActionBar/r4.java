package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class r4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;

    public /* synthetic */ r4(u4 u4Var, int i10) {
        this.a = i10;
        this.b = u4Var;
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
