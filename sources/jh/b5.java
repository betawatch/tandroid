package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d5 b;

    public /* synthetic */ b5(d5 d5Var, int i10) {
        this.a = i10;
        this.b = d5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.W = false;
                break;
            case 1:
                this.b.W = false;
                break;
            case 2:
                this.b.J.setVisibility(4);
                break;
            case 3:
                d5 d5Var = this.b;
                d5Var.o0 = d5Var.n0;
                d5Var.d(d5Var.Q);
                break;
            default:
                d5 d5Var2 = this.b;
                d5Var2.p0 = 1.0f;
                d5Var2.b.setScaleX(1.0f);
                d5Var2.b.setScaleY(d5Var2.p0);
                d5Var2.invalidate();
                break;
        }
    }
}
