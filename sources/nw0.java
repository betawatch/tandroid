// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class nw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sv0 c;
    public final /* synthetic */ xw0 d;

    public nw0(xw0 xw0Var, int i, int i2, sv0 sv0Var) {
        this.d = xw0Var;
        this.a = i;
        this.b = i2;
        this.c = sv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f = vm2.f(1.0f, this.a, this.b);
        xw0 xw0Var = this.d;
        xw0Var.S = f;
        xw0Var.h();
        ww0 ww0Var = xw0Var.f;
        ww0Var.invalidate();
        uw0 uw0Var = xw0Var.Y;
        uw0Var.setBackgroundColor(xw0Var.S);
        sv0 sv0Var = this.c;
        sv0Var.b(uw0Var, 1.0f);
        xw0Var.a = sv0Var.a(aob.zj);
        ww0Var.invalidate();
    }
}
