package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class s9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ s9(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                z9 z9Var = this.b.b;
                l7 l7Var = z9Var.u1;
                if (l7Var != null) {
                    l7Var.b();
                    z9Var.v.removeView(z9Var.u1);
                }
                z9Var.u1 = null;
                z9Var.P();
                break;
            default:
                super.onAnimationEnd(animator);
                l7 l7Var2 = this.b.b.u1;
                if (l7Var2 != null) {
                    l7Var2.a(true);
                    break;
                }
                break;
        }
    }
}
