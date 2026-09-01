package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ g1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ m0 f;

    public k0(m0 m0Var, g1 g1Var, float f10, m mVar, boolean z4, Runnable runnable) {
        this.f = m0Var;
        this.a = g1Var;
        this.b = f10;
        this.c = mVar;
        this.d = z4;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n1 n1Var;
        m0 m0Var = this.f;
        m0Var.x = null;
        d1 d1Var = new d1(new g1[]{this.a});
        o1 o1Var = m0Var.a;
        int currentColor = o1Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        d1Var.c = currentColor;
        d1Var.d = f10;
        m mVar = this.c;
        d1Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : o1Var.getCurrentColor();
        c1 painting = o1Var.getPainting();
        boolean z4 = this.d;
        painting.c(d1Var, currentColor2, z4, null);
        if (z4 && (n1Var = o1Var.a) != null) {
            n1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
