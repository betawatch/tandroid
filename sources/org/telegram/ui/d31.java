package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e31 b;

    public /* synthetic */ d31(e31 e31Var, int i10) {
        this.a = i10;
        this.b = e31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e31 e31Var = this.b;
                if (e31Var.h != null) {
                    e31Var.h = null;
                    e31Var.e = 0.0f;
                    e31Var.g();
                    e31Var.n.unlock();
                    ax axVar = e31Var.a;
                    if (axVar != null) {
                        axVar.onPause();
                        e31Var.a.onFragmentDestroy();
                        e31Var.removeAllViews();
                        e31Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    e31Var.d(false);
                    break;
                }
                break;
            default:
                e31 e31Var2 = this.b;
                if (e31Var2.h != null) {
                    e31Var2.h = null;
                    e31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
