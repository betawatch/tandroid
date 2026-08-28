package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ l5(uj0 uj0Var, int i9) {
        this.a = i9;
        this.b = uj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.H0.unlock();
                break;
            default:
                super.onAnimationEnd(animator);
                uj0 uj0Var = this.b;
                uj0Var.M = null;
                uj0Var.j0 = 0.0f;
                uj0Var.h0 = null;
                uj0Var.invalidate();
                break;
        }
    }
}
