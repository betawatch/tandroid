package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ b9(d9 d9Var, int i7) {
        this.a = i7;
        this.b = d9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p9 p9Var = this.b.r0;
                p9Var.X = 0.0f;
                p9.i(p9Var);
                break;
            default:
                p9 p9Var2 = this.b.r0;
                p9Var2.W = 0.0f;
                p9Var2.Z = 0.0f;
                p9.i(p9Var2);
                break;
        }
    }
}
