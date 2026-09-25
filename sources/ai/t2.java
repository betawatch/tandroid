package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.m50;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ci.x2 x2Var = (ci.x2) obj;
                x2Var.h = f7;
                x2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                ci.lc lcVar = (ci.lc) obj;
                lcVar.L = null;
                lcVar.I = f7;
                lcVar.k();
                lcVar.r.invalidate();
                lcVar.n.invalidate();
                runnable.run();
                lcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                lcVar.o();
                Runnable runnable2 = lcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    lcVar.Q = null;
                }
                lcVar.r.invalidate();
                lcVar.h0.invalidate();
                break;
            case 3:
                m50 m50Var = (m50) obj;
                m50Var.h = f7;
                m50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                yh.b4 b4Var = (yh.b4) obj;
                b4Var.y = f7;
                b4Var.invalidate();
                if (animator == b4Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
