package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.c50;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class o7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o7(Object obj, float f7, Runnable runnable, int i10) {
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
                p7 p7Var = (p7) obj;
                p7Var.y = f7;
                p7Var.invalidate();
                if (animator == p7Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ci.x1 x1Var = (ci.x1) obj;
                x1Var.n = f7;
                x1Var.invalidate();
                if (animator == x1Var.r && runnable != null) {
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
                c50 c50Var = (c50) obj;
                c50Var.h = f7;
                c50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
