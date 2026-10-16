package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import di.kc;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w50;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class i2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i2(Object obj, float f7, Runnable runnable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Runnable runnable = this.c;
        float f7 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l2 l2Var = (l2) obj;
                l2Var.n = f7;
                l2Var.invalidate();
                if (animator == l2Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                di.w2 w2Var = (di.w2) obj;
                w2Var.h = f7;
                w2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                kc kcVar = (kc) obj;
                kcVar.L = null;
                kcVar.I = f7;
                kcVar.j();
                kcVar.r.invalidate();
                kcVar.n.invalidate();
                runnable.run();
                kcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                kcVar.n();
                Runnable runnable2 = kcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    kcVar.Q = null;
                }
                kcVar.r.invalidate();
                kcVar.h0.invalidate();
                break;
            case 3:
                w50 w50Var = (w50) obj;
                w50Var.h = f7;
                w50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                zh.v3 v3Var = (zh.v3) obj;
                v3Var.y = f7;
                v3Var.invalidate();
                if (animator == v3Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
