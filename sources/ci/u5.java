package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qk0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class u5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ u5(qk0 qk0Var, int i10) {
        this.a = i10;
        this.b = qk0Var;
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
                qk0 qk0Var = this.b;
                qk0Var.Q = null;
                qk0Var.n0 = 0.0f;
                qk0Var.l0 = null;
                qk0Var.invalidate();
                break;
        }
    }
}
