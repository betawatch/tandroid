package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                    vx vxVar = l41Var.a;
                    if (vxVar != null) {
                        vxVar.onPause();
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
