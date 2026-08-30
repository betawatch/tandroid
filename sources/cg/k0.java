package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ m0 f;

    public k0(m0 m0Var, h1 h1Var, float f10, m mVar, boolean z4, Runnable runnable) {
        this.f = m0Var;
        this.a = h1Var;
        this.b = f10;
        this.c = mVar;
        this.d = z4;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o1 o1Var;
        m0 m0Var = this.f;
        m0Var.x = null;
        e1 e1Var = new e1(new h1[]{this.a});
        p1 p1Var = m0Var.a;
        int currentColor = p1Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        e1Var.c = currentColor;
        e1Var.d = f10;
        m mVar = this.c;
        e1Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : p1Var.getCurrentColor();
        d1 painting = p1Var.getPainting();
        boolean z4 = this.d;
        painting.c(e1Var, currentColor2, z4, null);
        if (z4 && (o1Var = p1Var.a) != null) {
            o1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
