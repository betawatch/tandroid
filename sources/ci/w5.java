package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class w5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ w5(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r6 r6Var = this.b;
                r6Var.b2 = 0.0f;
                r6Var.Z1.setAlpha(1.0f);
                r6Var.Z1.setVisibility(8);
                r6Var.Z1.n();
                break;
            case 1:
                this.b.p2.setTranslationY(0.0f);
                break;
            default:
                r6 r6Var2 = this.b;
                r6Var2.s2 = false;
                r6Var2.p2.setTranslationY(0.0f);
                r6Var2.w0();
                break;
        }
    }
}
