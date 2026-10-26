package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class r9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ r9(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                y9 y9Var = this.b.b;
                l7 l7Var = y9Var.u1;
                if (l7Var != null) {
                    l7Var.b();
                    y9Var.v.removeView(y9Var.u1);
                }
                y9Var.u1 = null;
                y9Var.P();
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
