package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l41 b;

    public /* synthetic */ k41(l41 l41Var, int i10) {
        this.a = i10;
        this.b = l41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l41 l41Var = this.b;
                if (l41Var.h != null) {
                    l41Var.h = null;
                    l41Var.e = 0.0f;
                    l41Var.g();
                    l41Var.n.unlock();
                    ux uxVar = l41Var.a;
                    if (uxVar != null) {
                        uxVar.onPause();
                        l41Var.a.onFragmentDestroy();
                        l41Var.removeAllViews();
                        l41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    l41Var.d(false);
                    break;
                }
                break;
            default:
                l41 l41Var2 = this.b;
                if (l41Var2.h != null) {
                    l41Var2.h = null;
                    l41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
