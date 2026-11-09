package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ c9(e9 e9Var, int i7) {
        this.a = i7;
        this.b = e9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q9 q9Var = this.b.r0;
                q9Var.X = 0.0f;
                q9.i(q9Var);
                break;
            default:
                q9 q9Var2 = this.b.r0;
                q9Var2.W = 0.0f;
                q9Var2.Z = 0.0f;
                q9.i(q9Var2);
                break;
        }
    }
}
