package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ v5(fk0 fk0Var, int i10) {
        this.a = i10;
        this.b = fk0Var;
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
                fk0 fk0Var = this.b;
                fk0Var.Q = null;
                fk0Var.n0 = 0.0f;
                fk0Var.l0 = null;
                fk0Var.invalidate();
                break;
        }
    }
}
