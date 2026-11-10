package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e7 b;

    public /* synthetic */ c7(e7 e7Var, int i7) {
        this.a = i7;
        this.b = e7Var;
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
                e7 e7Var = this.b;
                e7Var.v0 = e7Var.u0;
                e7Var.d(e7Var.a0);
                break;
            default:
                e7 e7Var2 = this.b;
                e7Var2.w0 = 1.0f;
                e7Var2.b.setScaleX(1.0f);
                e7Var2.b.setScaleY(e7Var2.w0);
                e7Var2.invalidate();
                break;
        }
    }
}
