package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.g50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l7(Object obj, float f7, Runnable runnable, int i10) {
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
                m7 m7Var = (m7) obj;
                m7Var.y = f7;
                m7Var.invalidate();
                if (animator == m7Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                di.w1 w1Var = (di.w1) obj;
                w1Var.n = f7;
                w1Var.invalidate();
                if (animator == w1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                fi.q2 q2Var = (fi.q2) obj;
                q2Var.h = f7;
                q2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                fi.sb sbVar = (fi.sb) obj;
                sbVar.L = null;
                sbVar.I = f7;
                sbVar.j();
                sbVar.r.invalidate();
                sbVar.n.invalidate();
                runnable.run();
                sbVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                sbVar.n();
                Runnable runnable2 = sbVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    sbVar.Q = null;
                }
                sbVar.r.invalidate();
                sbVar.h0.invalidate();
                break;
            default:
                g50 g50Var = (g50) obj;
                g50Var.h = f7;
                g50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
