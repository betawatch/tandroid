package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class c41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ c41(d41 d41Var, int i10) {
        this.a = i10;
        this.b = d41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d41 d41Var = this.b;
                if (d41Var.h != null) {
                    d41Var.h = null;
                    d41Var.e = 0.0f;
                    d41Var.g();
                    d41Var.n.unlock();
                    rx rxVar = d41Var.a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        d41Var.a.onFragmentDestroy();
                        d41Var.removeAllViews();
                        d41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    d41Var.d(false);
                    break;
                }
                break;
            default:
                d41 d41Var2 = this.b;
                if (d41Var2.h != null) {
                    d41Var2.h = null;
                    d41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
