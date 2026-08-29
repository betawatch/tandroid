package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ b5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.X1 = 0.0f;
                t5Var.V1.setAlpha(1.0f);
                t5Var.V1.setVisibility(8);
                t5Var.V1.n();
                break;
            case 1:
                this.b.l2.setTranslationY(0.0f);
                break;
            default:
                t5 t5Var2 = this.b;
                t5Var2.o2 = false;
                t5Var2.l2.setTranslationY(0.0f);
                t5Var2.w0();
                break;
        }
    }
}
