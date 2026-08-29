package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ r0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b2.setTranslationY(0.0f);
                break;
            default:
                g1 g1Var = this.b;
                g1Var.e2 = false;
                g1Var.b2.setTranslationY(0.0f);
                g1Var.m0();
                break;
        }
    }
}
