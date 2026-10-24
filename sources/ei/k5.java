package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl0 b;

    public /* synthetic */ k5(gl0 gl0Var, int i10) {
        this.a = i10;
        this.b = gl0Var;
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
                gl0 gl0Var = this.b;
                gl0Var.Q = null;
                gl0Var.n0 = 0.0f;
                gl0Var.l0 = null;
                gl0Var.invalidate();
                break;
        }
    }
}
