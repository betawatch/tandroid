// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bm extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hm b;

    public /* synthetic */ bm(hm hmVar, byte b) {
        this.a = b;
        this.b = hmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        byte b = this.a;
        hm hmVar = this.b;
        switch (b) {
            case 0:
                hmVar.scaleAnimator = null;
                hm.lockPositionChanging = false;
                break;
            case 1:
                hmVar.scaleAnimator = null;
                runnable = hmVar.removedAction;
                if (runnable != null) {
                    runnable2 = hmVar.removedAction;
                    runnable2.run();
                    hmVar.removedAction = null;
                    break;
                }
                break;
            default:
                hmVar.moveAnimator = null;
                break;
        }
    }
}
