package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ h5(v5 v5Var, int i7) {
        this.a = i7;
        this.b = v5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v5 v5Var = this.b;
                v5Var.L1 = 0.0f;
                v5Var.J1.setAlpha(1.0f);
                v5Var.J1.setVisibility(8);
                v5Var.J1.n();
                break;
            case 1:
                this.b.d2.setTranslationY(0.0f);
                break;
            default:
                v5 v5Var2 = this.b;
                v5Var2.g2 = false;
                v5Var2.d2.setTranslationY(0.0f);
                v5Var2.v0();
                break;
        }
    }
}
