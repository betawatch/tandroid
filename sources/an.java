// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class an extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gn b;

    public /* synthetic */ an(gn gnVar, byte b) {
        this.a = b;
        this.b = gnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        byte b = this.a;
        gn gnVar = this.b;
        switch (b) {
            case 0:
                gnVar.scaleAnimator = null;
                boolean unused = gn.lockPositionChanging = false;
                break;
            case 1:
                gnVar.scaleAnimator = null;
                runnable = gnVar.removedAction;
                if (runnable != null) {
                    runnable2 = gnVar.removedAction;
                    runnable2.run();
                    gnVar.removedAction = null;
                    break;
                }
                break;
            default:
                gnVar.moveAnimator = null;
                break;
        }
    }
}
