package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ u5(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
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
                w5 w5Var = this.b;
                w5Var.w0 = w5Var.v0;
                w5Var.d(w5Var.b0);
                break;
            default:
                w5 w5Var2 = this.b;
                w5Var2.x0 = 1.0f;
                w5Var2.b.setScaleX(1.0f);
                w5Var2.b.setScaleY(w5Var2.x0);
                w5Var2.invalidate();
                break;
        }
    }
}
