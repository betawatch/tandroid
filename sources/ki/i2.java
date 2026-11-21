package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ p1 c;
    public final /* synthetic */ s2 d;

    public i2(s2 s2Var, int i7, int i10, p1 p1Var) {
        this.d = s2Var;
        this.a = i7;
        this.b = i10;
        this.c = p1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.a, this.b);
        s2 s2Var = this.d;
        s2Var.S = f10;
        s2Var.l();
        r2 r2Var = s2Var.f;
        r2Var.invalidate();
        p2 p2Var = s2Var.Y;
        p2Var.setBackgroundColor(s2Var.S);
        p1 p1Var = this.c;
        p1Var.b(p2Var, 1.0f);
        s2Var.a = p1Var.a(m6.zj);
        r2Var.invalidate();
    }
}
