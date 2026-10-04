package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class e41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ e41(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f41 f41Var = this.b;
                if (f41Var.h != null) {
                    f41Var.h = null;
                    f41Var.e = 0.0f;
                    f41Var.g();
                    f41Var.n.unlock();
                    tx txVar = f41Var.a;
                    if (txVar != null) {
                        txVar.onPause();
                        f41Var.a.onFragmentDestroy();
                        f41Var.removeAllViews();
                        f41Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    f41Var.d(false);
                    break;
                }
                break;
            default:
                f41 f41Var2 = this.b;
                if (f41Var2.h != null) {
                    f41Var2.h = null;
                    f41Var2.d(true);
                    break;
                }
                break;
        }
    }
}
