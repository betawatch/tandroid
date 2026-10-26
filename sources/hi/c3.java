package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d2 c;
    public final /* synthetic */ m3 d;

    public c3(m3 m3Var, int i10, int i11, d2 d2Var) {
        this.d = m3Var;
        this.a = i10;
        this.b = i11;
        this.c = d2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.a, this.b);
        m3 m3Var = this.d;
        m3Var.R = f7;
        m3Var.h();
        l3 l3Var = m3Var.f;
        l3Var.invalidate();
        j3 j3Var = m3Var.X;
        j3Var.setBackgroundColor(m3Var.R);
        d2 d2Var = this.c;
        d2Var.b(j3Var, 1.0f);
        m3Var.a = d2Var.a(y6.Ii);
        l3Var.invalidate();
    }
}
