package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import di.pc;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class h2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h2(Object obj, float f7, Runnable runnable, int i10) {
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
                k2 k2Var = (k2) obj;
                k2Var.n = f7;
                k2Var.invalidate();
                if (animator == k2Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                di.y2 y2Var = (di.y2) obj;
                y2Var.h = f7;
                y2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                pc pcVar = (pc) obj;
                pcVar.L = null;
                pcVar.I = f7;
                pcVar.k();
                pcVar.r.invalidate();
                pcVar.n.invalidate();
                runnable.run();
                pcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                pcVar.o();
                Runnable runnable2 = pcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    pcVar.Q = null;
                }
                pcVar.r.invalidate();
                pcVar.h0.invalidate();
                break;
            case 3:
                s50 s50Var = (s50) obj;
                s50Var.h = f7;
                s50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                zh.a4 a4Var = (zh.a4) obj;
                a4Var.y = f7;
                a4Var.invalidate();
                if (animator == a4Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
