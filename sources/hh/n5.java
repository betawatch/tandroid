package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import lh.sb;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.b50;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n5(Object obj, float f10, Runnable runnable, int i10) {
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
                o5 o5Var = (o5) obj;
                o5Var.y = f10;
                o5Var.invalidate();
                if (animator == o5Var.A && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                jh.q1 q1Var = (jh.q1) obj;
                q1Var.n = f10;
                q1Var.invalidate();
                if (animator == q1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                lh.r2 r2Var = (lh.r2) obj;
                r2Var.h = f10;
                r2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                sb sbVar = (sb) obj;
                sbVar.H = null;
                sbVar.E = f10;
                sbVar.k();
                sbVar.r.invalidate();
                sbVar.n.invalidate();
                runnable.run();
                sbVar.L.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                sbVar.o();
                Runnable runnable2 = sbVar.M;
                if (runnable2 != null) {
                    runnable2.run();
                    sbVar.M = null;
                }
                sbVar.r.invalidate();
                sbVar.d0.invalidate();
                break;
            default:
                b50 b50Var = (b50) obj;
                b50Var.h = f10;
                b50Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
