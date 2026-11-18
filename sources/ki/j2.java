package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q1 c;
    public final /* synthetic */ t2 d;

    public j2(t2 t2Var, int i7, int i10, q1 q1Var) {
        this.d = t2Var;
        this.a = i7;
        this.b = i10;
        this.c = q1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        t2 t2Var = this.d;
        t2Var.S = f10;
        t2Var.l();
        s2 s2Var = t2Var.f;
        s2Var.invalidate();
        q2 q2Var = t2Var.Y;
        q2Var.setBackgroundColor(t2Var.S);
        q1 q1Var = this.c;
        q1Var.b(q2Var, 1.0f);
        t2Var.a = q1Var.a(n6.zj);
        s2Var.invalidate();
    }
}
