// default package

import android.animation.Animator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bi2 implements Animator.AnimatorListener {
    public final /* synthetic */ ci2 a;
    public final /* synthetic */ ei2 b;

    public bi2(ei2 ei2Var, ci2 ci2Var) {
        this.b = ei2Var;
        this.a = ci2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        ei2 ei2Var = this.b;
        ci2 ci2Var = this.a;
        ei2Var.a(1.0f, ci2Var, true);
        ci2Var.k = ci2Var.e;
        ci2Var.l = ci2Var.f;
        ci2Var.m = ci2Var.g;
        ci2Var.a((ci2Var.j + 1) % ci2Var.i.length);
        if (!ei2Var.f) {
            ei2Var.e += 1.0f;
            return;
        }
        ei2Var.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (ci2Var.n) {
            ci2Var.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
