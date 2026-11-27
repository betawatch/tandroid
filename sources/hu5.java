// default package

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hu5 implements Animator.AnimatorListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ f89 F;
    public final /* synthetic */ lu5 G;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final f89 e;
    public final byte f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    /* JADX WARN: Multi-variable type inference failed */
    public hu5(lu5 lu5Var, f89 f89Var, int i, float f, float f2, float f3, float f4, int i2, f89 f89Var2) {
        this.G = lu5Var;
        this.E = i2;
        this.F = f89Var2;
        this.f = i;
        this.e = f89Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ce0(this, (byte) 7));
        ofFloat.setTarget(f89Var.a);
        ofFloat.addListener(this);
        this.y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.x) {
            this.e.q(true);
        }
        this.x = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.y = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.w) {
            return;
        }
        int i = this.E;
        f89 f89Var = this.F;
        lu5 lu5Var = this.G;
        if (i <= 0) {
            lu5Var.y.a(lu5Var.I, f89Var);
        } else {
            lu5Var.a.add(f89Var.a);
            this.n = true;
            if (i > 0) {
                lu5Var.I.post(new xs4(lu5Var, this, i));
            }
        }
        View view = lu5Var.N;
        View view2 = f89Var.a;
        if (view == view2 && view2 == view) {
            lu5Var.N = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
