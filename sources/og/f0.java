package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f0 extends AnimatorListenerAdapter {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ g0 f;

    public f0(g0 g0Var, z0 z0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f = g0Var;
        this.a = z0Var;
        this.b = f7;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var;
        g0 g0Var = this.f;
        g0Var.x = null;
        w0 w0Var = new w0(new z0[]{this.a});
        h1 h1Var = g0Var.a;
        int currentColor = h1Var.getCurrentColor();
        float f7 = this.b * 1.0f;
        w0Var.c = currentColor;
        w0Var.d = f7;
        m mVar = this.c;
        w0Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : h1Var.getCurrentColor();
        v0 painting = h1Var.getPainting();
        boolean z10 = this.d;
        painting.c(w0Var, currentColor2, z10, null);
        if (z10 && (g1Var = h1Var.a) != null) {
            g1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
