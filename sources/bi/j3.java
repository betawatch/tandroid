package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j3(Object obj, float f7, Runnable runnable, int i10) {
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
                m3 m3Var = (m3) obj;
                m3Var.h = f7;
                m3Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ce ceVar = (ce) obj;
                ceVar.L = null;
                ceVar.I = f7;
                ceVar.k();
                ceVar.r.invalidate();
                ceVar.n.invalidate();
                runnable.run();
                ceVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                ceVar.o();
                Runnable runnable2 = ceVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    ceVar.Q = null;
                }
                ceVar.r.invalidate();
                ceVar.h0.invalidate();
                break;
            case 2:
                s50 s50Var = (s50) obj;
                s50Var.h = f7;
                s50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                xh.b4 b4Var = (xh.b4) obj;
                b4Var.y = f7;
                b4Var.invalidate();
                if (animator == b4Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                zh.e1 e1Var = (zh.e1) obj;
                e1Var.n = f7;
                e1Var.invalidate();
                if (animator == e1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
