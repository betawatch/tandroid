package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n41 b;

    public /* synthetic */ m41(n41 n41Var, int i10) {
        this.a = i10;
        this.b = n41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n41 n41Var = this.b;
                if (n41Var.h != null) {
                    n41Var.h = null;
                    n41Var.e = 0.0f;
                    n41Var.g();
                    n41Var.n.unlock();
                    xx xxVar = n41Var.a;
                    if (xxVar != null) {
                        xxVar.onPause();
                        n41Var.a.onFragmentDestroy();
                        n41Var.removeAllViews();
                        n41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    n41Var.d(false);
                    break;
                }
                break;
            default:
                n41 n41Var2 = this.b;
                if (n41Var2.h != null) {
                    n41Var2.h = null;
                    n41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
