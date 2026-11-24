// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class mx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rw0 c;
    public final /* synthetic */ wx0 d;

    public mx0(wx0 wx0Var, int i, int i2, rw0 rw0Var) {
        this.d = wx0Var;
        this.a = i;
        this.b = i2;
        this.c = rw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f = on2.f(1.0f, this.a, this.b);
        wx0 wx0Var = this.d;
        wx0Var.S = f;
        wx0Var.h();
        vx0 vx0Var = wx0Var.f;
        vx0Var.invalidate();
        tx0 tx0Var = wx0Var.Y;
        tx0Var.setBackgroundColor(wx0Var.S);
        rw0 rw0Var = this.c;
        rw0Var.b(tx0Var, 1.0f);
        wx0Var.a = rw0Var.a(cmb.yj);
        vx0Var.invalidate();
    }
}
