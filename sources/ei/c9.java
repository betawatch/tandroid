package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ c9(e9 e9Var, int i3) {
        this.a = i3;
        this.b = e9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r9 r9Var = this.b.s0;
                r9Var.Y = 0.0f;
                r9.w(r9Var);
                break;
            default:
                r9 r9Var2 = this.b.s0;
                r9Var2.X = 0.0f;
                r9Var2.a0 = 0.0f;
                r9.w(r9Var2);
                break;
        }
    }
}
