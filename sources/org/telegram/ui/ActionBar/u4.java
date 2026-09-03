package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4 b;

    public /* synthetic */ u4(x4 x4Var, int i10) {
        this.a = i10;
        this.b = x4Var;
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
