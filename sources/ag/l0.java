package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ j1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ n0 f;

    public l0(n0 n0Var, j1 j1Var, float f9, m mVar, boolean z10, Runnable runnable) {
        this.f = n0Var;
        this.a = j1Var;
        this.b = f9;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var;
        n0 n0Var = this.f;
        n0Var.x = null;
        g1 g1Var = new g1(new j1[]{this.a});
        t1 t1Var = n0Var.a;
        int currentColor = t1Var.getCurrentColor();
        float f9 = this.b * 1.0f;
        g1Var.c = currentColor;
        g1Var.d = f9;
        m mVar = this.c;
        g1Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : t1Var.getCurrentColor();
        f1 painting = t1Var.getPainting();
        boolean z10 = this.d;
        painting.c(g1Var, currentColor2, z10, null);
        if (z10 && (s1Var = t1Var.a) != null) {
            s1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
