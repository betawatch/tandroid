// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class am extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gm b;

    public /* synthetic */ am(gm gmVar, byte b) {
        this.a = b;
        this.b = gmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        byte b = this.a;
        gm gmVar = this.b;
        switch (b) {
            case 0:
                gmVar.scaleAnimator = null;
                boolean unused = gm.lockPositionChanging = false;
                break;
            case 1:
                gmVar.scaleAnimator = null;
                runnable = gmVar.removedAction;
                if (runnable != null) {
                    runnable2 = gmVar.removedAction;
                    runnable2.run();
                    gmVar.removedAction = null;
                    break;
                }
                break;
            default:
                gmVar.moveAnimator = null;
                break;
        }
    }
}
