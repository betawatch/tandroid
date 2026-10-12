package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class u5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ u5(o6 o6Var, int i10) {
        this.a = i10;
        this.b = o6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o6 o6Var = this.b;
                o6Var.b2 = 0.0f;
                o6Var.Z1.setAlpha(1.0f);
                o6Var.Z1.setVisibility(8);
                o6Var.Z1.n();
                break;
            case 1:
                this.b.p2.setTranslationY(0.0f);
                break;
            default:
                o6 o6Var2 = this.b;
                o6Var2.s2 = false;
                o6Var2.p2.setTranslationY(0.0f);
                o6Var2.v0();
                break;
        }
    }
}
