package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ x4(m5 m5Var, int i7) {
        this.a = i7;
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
