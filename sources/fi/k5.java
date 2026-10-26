package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ k5(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                e6Var.Q1 = 0.0f;
                e6Var.O1.setAlpha(1.0f);
                e6Var.O1.setVisibility(8);
                e6Var.O1.n();
                break;
            case 1:
                this.b.e2.setTranslationY(0.0f);
                break;
            default:
                e6 e6Var2 = this.b;
                e6Var2.h2 = false;
                e6Var2.e2.setTranslationY(0.0f);
                e6Var2.t0();
                break;
        }
    }
}
