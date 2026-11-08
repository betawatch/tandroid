package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ i9(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                p9 p9Var = this.b.b;
                c7 c7Var = p9Var.t1;
                if (c7Var != null) {
                    c7Var.b();
                    p9Var.w.removeView(p9Var.t1);
                }
                p9Var.t1 = null;
                p9Var.V();
                break;
            default:
                super.onAnimationEnd(animator);
                c7 c7Var2 = this.b.b.t1;
                if (c7Var2 != null) {
                    c7Var2.a(true);
                    break;
                }
                break;
        }
    }
}
