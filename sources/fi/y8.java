package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class y8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ y8(o8 o8Var, int i7) {
        this.a = i7;
        this.b = o8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                f9 f9Var = this.b.b;
                t6 t6Var = f9Var.u1;
                if (t6Var != null) {
                    t6Var.b();
                    f9Var.w.removeView(f9Var.u1);
                }
                f9Var.u1 = null;
                f9Var.V();
                break;
            default:
                super.onAnimationEnd(animator);
                t6 t6Var2 = this.b.b.u1;
                if (t6Var2 != null) {
                    t6Var2.a(true);
                    break;
                }
                break;
        }
    }
}
