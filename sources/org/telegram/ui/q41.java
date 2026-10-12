package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ q41(r41 r41Var, int i10) {
        this.a = i10;
        this.b = r41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r41 r41Var = this.b;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.e = 0.0f;
                    r41Var.g();
                    r41Var.n.unlock();
                    zx zxVar = r41Var.a;
                    if (zxVar != null) {
                        zxVar.onPause();
                        r41Var.a.onFragmentDestroy();
                        r41Var.removeAllViews();
                        r41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    r41Var.d(false);
                    break;
                }
                break;
            default:
                r41 r41Var2 = this.b;
                if (r41Var2.h != null) {
                    r41Var2.h = null;
                    r41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
