package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ f2 c;
    public final /* synthetic */ n3 d;

    public c3(n3 n3Var, int i10, int i11, f2 f2Var) {
        this.d = n3Var;
        this.a = i10;
        this.b = i11;
        this.c = f2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        n3 n3Var = this.d;
        n3Var.Q = d;
        n3Var.h();
        m3 m3Var = n3Var.e;
        m3Var.invalidate();
        k3 k3Var = n3Var.W;
        k3Var.setBackgroundColor(n3Var.Q);
        f2 f2Var = this.c;
        f2Var.b(k3Var, 1.0f);
        n3Var.a = f2Var.a(j6.Ii);
        m3Var.invalidate();
    }
}
