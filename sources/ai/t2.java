package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.r50;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class t2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t2(Object obj, float f7, Runnable runnable, int i10) {
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
                w2 w2Var = (w2) obj;
                w2Var.n = f7;
                w2Var.invalidate();
                if (animator == w2Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ci.y2 y2Var = (ci.y2) obj;
                y2Var.h = f7;
                y2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                ci.oc ocVar = (ci.oc) obj;
                ocVar.L = null;
                ocVar.I = f7;
                ocVar.k();
                ocVar.r.invalidate();
                ocVar.n.invalidate();
                runnable.run();
                ocVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                ocVar.o();
                Runnable runnable2 = ocVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    ocVar.Q = null;
                }
                ocVar.r.invalidate();
                ocVar.h0.invalidate();
                break;
            case 3:
                r50 r50Var = (r50) obj;
                r50Var.h = f7;
                r50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                yh.d4 d4Var = (yh.d4) obj;
                d4Var.y = f7;
                d4Var.invalidate();
                if (animator == d4Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
