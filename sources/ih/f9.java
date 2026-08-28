package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ f9(v8 v8Var, int i9) {
        this.a = i9;
        this.b = v8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                m9 m9Var = this.b.b;
                z6 z6Var = m9Var.q1;
                if (z6Var != null) {
                    z6Var.b();
                    m9Var.v.removeView(m9Var.q1);
                }
                m9Var.q1 = null;
                m9Var.P();
                break;
            default:
                super.onAnimationEnd(animator);
                z6 z6Var2 = this.b.b.q1;
                if (z6Var2 != null) {
                    z6Var2.a(true);
                    break;
                }
                break;
        }
    }
}
