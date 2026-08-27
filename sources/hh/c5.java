package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;

    public /* synthetic */ c5(e5 e5Var, int i10) {
        this.a = i10;
        this.b = e5Var;
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
                e5 e5Var = this.b;
                e5Var.o0 = e5Var.n0;
                e5Var.d(e5Var.Q);
                break;
            default:
                e5 e5Var2 = this.b;
                e5Var2.p0 = 1.0f;
                e5Var2.b.setScaleX(1.0f);
                e5Var2.b.setScaleY(e5Var2.p0);
                e5Var2.invalidate();
                break;
        }
    }
}
