package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class u5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk0 b;

    public /* synthetic */ u5(sk0 sk0Var, int i10) {
        this.a = i10;
        this.b = sk0Var;
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
                sk0 sk0Var = this.b;
                sk0Var.Q = null;
                sk0Var.n0 = 0.0f;
                sk0Var.l0 = null;
                sk0Var.invalidate();
                break;
        }
    }
}
