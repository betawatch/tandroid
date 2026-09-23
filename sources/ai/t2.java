package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                o50 o50Var = (o50) obj;
                o50Var.h = f7;
                o50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                yh.c4 c4Var = (yh.c4) obj;
                c4Var.y = f7;
                c4Var.invalidate();
                if (animator == c4Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
