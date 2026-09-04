package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o41 b;

    public /* synthetic */ n41(o41 o41Var, int i10) {
        this.a = i10;
        this.b = o41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o41 o41Var = this.b;
                if (o41Var.h != null) {
                    o41Var.h = null;
                    o41Var.e = 0.0f;
                    o41Var.g();
                    o41Var.n.unlock();
                    vx vxVar = o41Var.a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        o41Var.a.onFragmentDestroy();
                        o41Var.removeAllViews();
                        o41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    o41Var.d(false);
                    break;
                }
                break;
            default:
                o41 o41Var2 = this.b;
                if (o41Var2.h != null) {
                    o41Var2.h = null;
                    o41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
