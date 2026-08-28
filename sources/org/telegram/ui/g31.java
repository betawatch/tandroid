package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h31 b;

    public /* synthetic */ g31(h31 h31Var, int i9) {
        this.a = i9;
        this.b = h31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h31 h31Var = this.b;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.e = 0.0f;
                    h31Var.g();
                    h31Var.n.unlock();
                    fx fxVar = h31Var.a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        h31Var.a.onFragmentDestroy();
                        h31Var.removeAllViews();
                        h31Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    h31Var.d(false);
                    break;
                }
                break;
            default:
                h31 h31Var2 = this.b;
                if (h31Var2.h != null) {
                    h31Var2.h = null;
                    h31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
