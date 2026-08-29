package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h31 b;

    public /* synthetic */ g31(h31 h31Var, int i10) {
        this.a = i10;
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
                    hx hxVar = h31Var.a;
                    if (hxVar != null) {
                        hxVar.onPause();
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
