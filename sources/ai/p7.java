package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.d50;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class p7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p7(Object obj, float f7, Runnable runnable, int i10) {
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
                q7 q7Var = (q7) obj;
                q7Var.y = f7;
                q7Var.invalidate();
                if (animator == q7Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ci.w1 w1Var = (ci.w1) obj;
                w1Var.n = f7;
                w1Var.invalidate();
                if (animator == w1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                ei.s2 s2Var = (ei.s2) obj;
                s2Var.h = f7;
                s2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ei.vb vbVar = (ei.vb) obj;
                vbVar.L = null;
                vbVar.I = f7;
                vbVar.j();
                vbVar.r.invalidate();
                vbVar.n.invalidate();
                runnable.run();
                vbVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                vbVar.n();
                Runnable runnable2 = vbVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    vbVar.Q = null;
                }
                vbVar.r.invalidate();
                vbVar.h0.invalidate();
                break;
            default:
                d50 d50Var = (d50) obj;
                d50Var.h = f7;
                d50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
