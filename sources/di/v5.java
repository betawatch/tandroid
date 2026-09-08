package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
