package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ e5(g5 g5Var, int i9) {
        this.a = i9;
        this.b = g5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.W = false;
                break;
            case 1:
                this.b.W = false;
                break;
            case 2:
                this.b.J.setVisibility(4);
                break;
            case 3:
                g5 g5Var = this.b;
                g5Var.o0 = g5Var.n0;
                g5Var.d(g5Var.Q);
                break;
            default:
                g5 g5Var2 = this.b;
                g5Var2.p0 = 1.0f;
                g5Var2.b.setScaleX(1.0f);
                g5Var2.b.setScaleY(g5Var2.p0);
                g5Var2.invalidate();
                break;
        }
    }
}
