package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ u1 c;
    public final /* synthetic */ a3 d;

    public q2(a3 a3Var, int i3, int i10, u1 u1Var) {
        this.d = a3Var;
        this.a = i3;
        this.b = i10;
        this.c = u1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        a3 a3Var = this.d;
        a3Var.S = f10;
        a3Var.l();
        z2 z2Var = a3Var.f;
        z2Var.invalidate();
        x2 x2Var = a3Var.Y;
        x2Var.setBackgroundColor(a3Var.S);
        u1 u1Var = this.c;
        u1Var.b(x2Var, 1.0f);
        a3Var.a = u1Var.a(k6.wj);
        z2Var.invalidate();
    }
}
