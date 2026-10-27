package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
