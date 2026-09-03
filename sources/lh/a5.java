package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ a5(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.a0 = false;
                break;
            case 1:
                this.b.a0 = false;
                break;
            case 2:
                this.b.K.setVisibility(4);
                break;
            case 3:
                c5 c5Var = this.b;
                c5Var.p0 = c5Var.o0;
                c5Var.d(c5Var.R);
                break;
            default:
                c5 c5Var2 = this.b;
                c5Var2.q0 = 1.0f;
                c5Var2.b.setScaleX(1.0f);
                c5Var2.b.setScaleY(c5Var2.q0);
                c5Var2.invalidate();
                break;
        }
    }
}
