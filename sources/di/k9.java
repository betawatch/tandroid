package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ k9(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b.x0;
                y9Var.X = 0.0f;
                y9.k(y9Var);
                break;
            default:
                y9 y9Var2 = this.b.x0;
                y9Var2.W = 0.0f;
                y9Var2.Z = 0.0f;
                y9.k(y9Var2);
                break;
        }
    }
}
