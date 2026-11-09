package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z8 b;

    public /* synthetic */ j9(z8 z8Var, int i7) {
        this.a = i7;
        this.b = z8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                q9 q9Var = this.b.b;
                d7 d7Var = q9Var.t1;
                if (d7Var != null) {
                    d7Var.b();
                    q9Var.w.removeView(q9Var.t1);
                }
                q9Var.t1 = null;
                q9Var.V();
                break;
            default:
                super.onAnimationEnd(animator);
                d7 d7Var2 = this.b.b.t1;
                if (d7Var2 != null) {
                    d7Var2.a(true);
                    break;
                }
                break;
        }
    }
}
