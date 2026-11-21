package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class v4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ v4(k5 k5Var, int i7) {
        this.a = i7;
        this.b = k5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                k5Var.L1 = 0.0f;
                k5Var.J1.setAlpha(1.0f);
                k5Var.J1.setVisibility(8);
                k5Var.J1.n();
                break;
            case 1:
                this.b.Z1.setTranslationY(0.0f);
                break;
            default:
                k5 k5Var2 = this.b;
                k5Var2.c2 = false;
                k5Var2.Z1.setTranslationY(0.0f);
                k5Var2.t0();
                break;
        }
    }
}
