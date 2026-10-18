package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class c7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ c7(e7 e7Var, int i10) {
        this.a = i10;
        this.b = e7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.e0 = false;
                break;
            case 1:
                this.b.e0 = false;
                break;
            case 2:
                this.b.O.setVisibility(4);
                break;
            case 3:
                e7 e7Var = this.b;
                e7Var.t0 = e7Var.s0;
                e7Var.d(e7Var.V);
                break;
            default:
                e7 e7Var2 = this.b;
                e7Var2.u0 = 1.0f;
                e7Var2.b.setScaleX(1.0f);
                e7Var2.b.setScaleY(e7Var2.u0);
                e7Var2.invalidate();
                break;
        }
    }
}
