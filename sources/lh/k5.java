package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k5(Object obj, float f10, Runnable runnable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Runnable runnable = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                l5Var.y = f10;
                l5Var.invalidate();
                if (animator == l5Var.B && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                nh.r1 r1Var = (nh.r1) obj;
                r1Var.n = f10;
                r1Var.invalidate();
                if (animator == r1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                o50 o50Var = (o50) obj;
                o50Var.h = f10;
                o50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ph.d2 d2Var = (ph.d2) obj;
                d2Var.h = f10;
                d2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ph.da daVar = (ph.da) obj;
                daVar.I = null;
                daVar.F = f10;
                daVar.k();
                daVar.r.invalidate();
                daVar.n.invalidate();
                runnable.run();
                daVar.M.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                daVar.o();
                Runnable runnable2 = daVar.N;
                if (runnable2 != null) {
                    runnable2.run();
                    daVar.N = null;
                }
                daVar.r.invalidate();
                daVar.e0.invalidate();
                break;
        }
    }
}
