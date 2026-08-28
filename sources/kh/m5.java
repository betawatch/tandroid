package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ m5(g6 g6Var, int i9) {
        this.a = i9;
        this.b = g6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g6 g6Var = this.b;
                g6Var.X1 = 0.0f;
                g6Var.V1.setAlpha(1.0f);
                g6Var.V1.setVisibility(8);
                g6Var.V1.n();
                break;
            case 1:
                this.b.l2.setTranslationY(0.0f);
                break;
            default:
                g6 g6Var2 = this.b;
                g6Var2.o2 = false;
                g6Var2.l2.setTranslationY(0.0f);
                g6Var2.w0();
                break;
        }
    }
}
