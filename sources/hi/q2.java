package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t1 c;
    public final /* synthetic */ a3 d;

    public q2(a3 a3Var, int i7, int i10, t1 t1Var) {
        this.d = a3Var;
        this.a = i7;
        this.b = i10;
        this.c = t1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        a3 a3Var = this.d;
        a3Var.R = f10;
        a3Var.l();
        z2 z2Var = a3Var.f;
        z2Var.invalidate();
        x2 x2Var = a3Var.X;
        x2Var.setBackgroundColor(a3Var.R);
        t1 t1Var = this.c;
        t1Var.b(x2Var, 1.0f);
        a3Var.a = t1Var.a(k6.wj);
        z2Var.invalidate();
    }
}
