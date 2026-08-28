package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9 b;

    public /* synthetic */ y8(a9 a9Var, int i9) {
        this.a = i9;
        this.b = a9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m9 m9Var = this.b.E0;
                m9Var.T = 0.0f;
                m9.k(m9Var);
                break;
            default:
                m9 m9Var2 = this.b.E0;
                m9Var2.S = 0.0f;
                m9Var2.V = 0.0f;
                m9.k(m9Var2);
                break;
        }
    }
}
