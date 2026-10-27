package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;

    public /* synthetic */ f31(g31 g31Var, int i10) {
        this.a = i10;
        this.b = g31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g31 g31Var = this.b;
                if (g31Var.h != null) {
                    g31Var.h = null;
                    g31Var.e = 0.0f;
                    g31Var.g();
                    g31Var.n.unlock();
                    cx cxVar = g31Var.a;
                    if (cxVar != null) {
                        cxVar.onPause();
                        g31Var.a.onFragmentDestroy();
                        g31Var.removeAllViews();
                        g31Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    g31Var.d(false);
                    break;
                }
                break;
            default:
                g31 g31Var2 = this.b;
                if (g31Var2.h != null) {
                    g31Var2.h = null;
                    g31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
