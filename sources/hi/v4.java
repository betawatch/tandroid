package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ v4(l5 l5Var, int i7) {
        this.a = i7;
        this.b = l5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l5 l5Var = this.b;
                l5Var.L1 = 0.0f;
                l5Var.J1.setAlpha(1.0f);
                l5Var.J1.setVisibility(8);
                l5Var.J1.n();
                break;
            case 1:
                this.b.Z1.setTranslationY(0.0f);
                break;
            default:
                l5 l5Var2 = this.b;
                l5Var2.c2 = false;
                l5Var2.Z1.setTranslationY(0.0f);
                l5Var2.t0();
                break;
        }
    }
}
