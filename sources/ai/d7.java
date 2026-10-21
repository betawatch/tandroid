package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class d7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;

    public /* synthetic */ d7(f7 f7Var, int i10) {
        this.a = i10;
        this.b = f7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.g0 = false;
                break;
            case 1:
                this.b.g0 = false;
                break;
            case 2:
                this.b.O.setVisibility(4);
                break;
            case 3:
                f7 f7Var = this.b;
                f7Var.v0 = f7Var.u0;
                f7Var.d(f7Var.a0);
                break;
            default:
                f7 f7Var2 = this.b;
                f7Var2.w0 = 1.0f;
                f7Var2.b.setScaleX(1.0f);
                f7Var2.b.setScaleY(f7Var2.w0);
                f7Var2.invalidate();
                break;
        }
    }
}
