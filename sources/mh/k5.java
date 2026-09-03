package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.n50;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                oh.r1 r1Var = (oh.r1) obj;
                r1Var.n = f10;
                r1Var.invalidate();
                if (animator == r1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                n50 n50Var = (n50) obj;
                n50Var.h = f10;
                n50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                qh.c2 c2Var = (qh.c2) obj;
                c2Var.h = f10;
                c2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                qh.ba baVar = (qh.ba) obj;
                baVar.I = null;
                baVar.F = f10;
                baVar.k();
                baVar.r.invalidate();
                baVar.n.invalidate();
                runnable.run();
                baVar.M.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                baVar.o();
                Runnable runnable2 = baVar.N;
                if (runnable2 != null) {
                    runnable2.run();
                    baVar.N = null;
                }
                baVar.r.invalidate();
                baVar.e0.invalidate();
                break;
        }
    }
}
