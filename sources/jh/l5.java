package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import nh.gb;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.a50;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l5(Object obj, float f9, Runnable runnable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f9;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Runnable runnable = this.c;
        float f9 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                m5 m5Var = (m5) obj;
                m5Var.y = f9;
                m5Var.invalidate();
                if (animator == m5Var.A && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                lh.q1 q1Var = (lh.q1) obj;
                q1Var.n = f9;
                q1Var.invalidate();
                if (animator == q1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                nh.p2 p2Var = (nh.p2) obj;
                p2Var.h = f9;
                p2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                gb gbVar = (gb) obj;
                gbVar.H = null;
                gbVar.E = f9;
                gbVar.k();
                gbVar.r.invalidate();
                gbVar.n.invalidate();
                runnable.run();
                gbVar.L.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                gbVar.o();
                Runnable runnable2 = gbVar.M;
                if (runnable2 != null) {
                    runnable2.run();
                    gbVar.M = null;
                }
                gbVar.r.invalidate();
                gbVar.d0.invalidate();
                break;
            default:
                a50 a50Var = (a50) obj;
                a50Var.h = f9;
                a50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
