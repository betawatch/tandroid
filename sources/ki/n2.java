package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ u1 c;
    public final /* synthetic */ x2 d;

    public n2(x2 x2Var, int i7, int i10, u1 u1Var) {
        this.d = x2Var;
        this.a = i7;
        this.b = i10;
        this.c = u1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        x2 x2Var = this.d;
        x2Var.S = f10;
        x2Var.l();
        w2 w2Var = x2Var.f;
        w2Var.invalidate();
        u2 u2Var = x2Var.Y;
        u2Var.setBackgroundColor(x2Var.S);
        u1 u1Var = this.c;
        u1Var.b(u2Var, 1.0f);
        x2Var.a = u1Var.a(j6.zj);
        w2Var.invalidate();
    }
}
