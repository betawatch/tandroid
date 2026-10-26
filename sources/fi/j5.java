package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl0 b;

    public /* synthetic */ j5(fl0 fl0Var, int i10) {
        this.a = i10;
        this.b = fl0Var;
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
                fl0 fl0Var = this.b;
                fl0Var.Q = null;
                fl0Var.n0 = 0.0f;
                fl0Var.l0 = null;
                fl0Var.invalidate();
                break;
        }
    }
}
