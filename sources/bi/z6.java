package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;

    public /* synthetic */ z6(b7 b7Var, int i10) {
        this.a = i10;
        this.b = b7Var;
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
                b7 b7Var = this.b;
                b7Var.v0 = b7Var.u0;
                b7Var.d(b7Var.a0);
                break;
            default:
                b7 b7Var2 = this.b;
                b7Var2.w0 = 1.0f;
                b7Var2.b.setScaleX(1.0f);
                b7Var2.b.setScaleY(b7Var2.w0);
                b7Var2.invalidate();
                break;
        }
    }
}
