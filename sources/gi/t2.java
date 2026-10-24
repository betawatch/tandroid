package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class t2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ w1 c;
    public final /* synthetic */ d3 d;

    public t2(d3 d3Var, int i10, int i11, w1 w1Var) {
        this.d = d3Var;
        this.a = i10;
        this.b = i11;
        this.c = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.a, this.b);
        d3 d3Var = this.d;
        d3Var.R = f7;
        d3Var.h();
        c3 c3Var = d3Var.f;
        c3Var.invalidate();
        a3 a3Var = d3Var.X;
        a3Var.setBackgroundColor(d3Var.R);
        w1 w1Var = this.c;
        w1Var.b(a3Var, 1.0f);
        d3Var.a = w1Var.a(k6.Ii);
        c3Var.invalidate();
    }
}
