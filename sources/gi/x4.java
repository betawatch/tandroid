package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ x4(m5 m5Var, int i3) {
        this.a = i3;
        this.b = m5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m5 m5Var = this.b;
                m5Var.L1 = 0.0f;
                m5Var.J1.setAlpha(1.0f);
                m5Var.J1.setVisibility(8);
                m5Var.J1.n();
                break;
            case 1:
                this.b.Z1.setTranslationY(0.0f);
                break;
            default:
                m5 m5Var2 = this.b;
                m5Var2.c2 = false;
                m5Var2.Z1.setTranslationY(0.0f);
                m5Var2.t0();
                break;
        }
    }
}
