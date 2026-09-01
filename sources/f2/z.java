package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class z implements Animator.AnimatorListener {
    public final /* synthetic */ m1 B;
    public final /* synthetic */ f0 C;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final m1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public z(f0 f0Var, m1 m1Var, int i10, float f10, float f11, float f12, float f13, int i11, m1 m1Var2) {
        this.C = f0Var;
        this.y = i11;
        this.B = m1Var2;
        this.f = i10;
        this.e = m1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d0(this, 0));
        ofFloat.setTarget(m1Var.a);
        ofFloat.addListener(this);
        this.x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.w) {
            this.e.q(true);
        }
        this.w = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.x = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.v) {
            return;
        }
        int i10 = this.y;
        m1 m1Var = this.B;
        f0 f0Var = this.C;
        if (i10 <= 0) {
            f0Var.x.a(f0Var.E, m1Var);
        } else {
            f0Var.a.add(m1Var.a);
            this.n = true;
            if (i10 > 0) {
                f0Var.E.post(new androidx.biometric.k(f0Var, this, i10));
            }
        }
        View view = f0Var.J;
        View view2 = m1Var.a;
        if (view == view2) {
            f0Var.o(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
