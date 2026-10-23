package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b31 b;

    public /* synthetic */ a31(b31 b31Var, int i10) {
        this.a = i10;
        this.b = b31Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b31 b31Var = this.b;
                if (b31Var.h != null) {
                    b31Var.h = null;
                    b31Var.e = 0.0f;
                    b31Var.g();
                    b31Var.n.unlock();
                    fx fxVar = b31Var.a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        b31Var.a.onFragmentDestroy();
                        b31Var.removeAllViews();
                        b31Var.a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    b31Var.d(false);
                    break;
                }
                break;
            default:
                b31 b31Var2 = this.b;
                if (b31Var2.h != null) {
                    b31Var2.h = null;
                    b31Var2.d(true);
                    break;
                }
                break;
        }
    }
}
