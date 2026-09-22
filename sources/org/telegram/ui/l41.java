package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m41 b;

    public /* synthetic */ l41(m41 m41Var, int i10) {
        this.a = i10;
        this.b = m41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m41 m41Var = this.b;
                if (m41Var.h != null) {
                    m41Var.h = null;
                    m41Var.e = 0.0f;
                    m41Var.g();
                    m41Var.n.unlock();
                    vx vxVar = m41Var.a;
                    if (vxVar != null) {
                        vxVar.onPause();
                        m41Var.a.onFragmentDestroy();
                        m41Var.removeAllViews();
                        m41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    m41Var.d(false);
                    break;
                }
                break;
            default:
                m41 m41Var2 = this.b;
                if (m41Var2.h != null) {
                    m41Var2.h = null;
                    m41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
