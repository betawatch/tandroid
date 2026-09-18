package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk0 b;

    public /* synthetic */ v5(gk0 gk0Var, int i10) {
        this.a = i10;
        this.b = gk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.L0.unlock();
                break;
            default:
                super.onAnimationEnd(animator);
                gk0 gk0Var = this.b;
                gk0Var.Q = null;
                gk0Var.n0 = 0.0f;
                gk0Var.l0 = null;
                gk0Var.invalidate();
                break;
        }
    }
}
