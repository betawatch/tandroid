// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ew0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ iv0 c;
    public final /* synthetic */ ow0 d;

    public ew0(ow0 ow0Var, int i, int i2, iv0 iv0Var) {
        this.d = ow0Var;
        this.a = i;
        this.b = i2;
        this.c = iv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f = bm2.f(1.0f, this.a, this.b);
        ow0 ow0Var = this.d;
        ow0Var.S = f;
        ow0Var.h();
        nw0 nw0Var = ow0Var.f;
        nw0Var.invalidate();
        lw0 lw0Var = ow0Var.Y;
        lw0Var.setBackgroundColor(ow0Var.S);
        iv0 iv0Var = this.c;
        iv0Var.b(lw0Var, 1.0f);
        ow0Var.a = iv0Var.a(bkb.yj);
        nw0Var.invalidate();
    }
}
