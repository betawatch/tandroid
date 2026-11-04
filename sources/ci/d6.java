package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ d6(f6 f6Var, int i3) {
        this.a = i3;
        this.b = f6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.h0 = false;
                break;
            case 1:
                this.b.h0 = false;
                break;
            case 2:
                this.b.P.setVisibility(4);
                break;
            case 3:
                f6 f6Var = this.b;
                f6Var.w0 = f6Var.v0;
                f6Var.d(f6Var.b0);
                break;
            default:
                f6 f6Var2 = this.b;
                f6Var2.x0 = 1.0f;
                f6Var2.b.setScaleX(1.0f);
                f6Var2.b.setScaleY(f6Var2.x0);
                f6Var2.invalidate();
                break;
        }
    }
}
