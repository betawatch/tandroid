package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z8 b;

    public /* synthetic */ k9(z8 z8Var, int i3) {
        this.a = i3;
        this.b = z8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                r9 r9Var = this.b.b;
                d7 d7Var = r9Var.v1;
                if (d7Var != null) {
                    d7Var.b();
                    r9Var.w.removeView(r9Var.v1);
                }
                r9Var.v1 = null;
                r9Var.d0();
                break;
            default:
                super.onAnimationEnd(animator);
                d7 d7Var2 = this.b.b.v1;
                if (d7Var2 != null) {
                    d7Var2.a(true);
                    break;
                }
                break;
        }
    }
}
