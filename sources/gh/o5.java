package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kh.wb;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.y40;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o5(Object obj, float f10, Runnable runnable, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = f10;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.a;
        Runnable runnable = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                p5 p5Var = (p5) obj;
                p5Var.y = f10;
                p5Var.invalidate();
                if (animator == p5Var.A && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ih.s1 s1Var = (ih.s1) obj;
                s1Var.n = f10;
                s1Var.invalidate();
                if (animator == s1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                kh.s2 s2Var = (kh.s2) obj;
                s2Var.h = f10;
                s2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                wb wbVar = (wb) obj;
                wbVar.H = null;
                wbVar.E = f10;
                wbVar.k();
                wbVar.r.invalidate();
                wbVar.n.invalidate();
                runnable.run();
                wbVar.L.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                wbVar.o();
                Runnable runnable2 = wbVar.M;
                if (runnable2 != null) {
                    runnable2.run();
                    wbVar.M = null;
                }
                wbVar.r.invalidate();
                wbVar.d0.invalidate();
                break;
            default:
                y40 y40Var = (y40) obj;
                y40Var.h = f10;
                y40Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
