package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z implements Animator.AnimatorListener {
    public final /* synthetic */ n1 A;
    public final /* synthetic */ e0 B;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final n1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public z(e0 e0Var, n1 n1Var, int i10, float f9, float f10, float f11, float f12, int i11, n1 n1Var2) {
        this.B = e0Var;
        this.y = i11;
        this.A = n1Var2;
        this.f = i10;
        this.e = n1Var;
        this.a = f9;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new cg.c1(this, 2));
        ofFloat.setTarget(n1Var.a);
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
        n1 n1Var = this.A;
        e0 e0Var = this.B;
        if (i10 <= 0) {
            e0Var.x.a(e0Var.D, n1Var);
        } else {
            e0Var.a.add(n1Var.a);
            this.n = true;
            if (i10 > 0) {
                e0Var.D.post(new ab.o(e0Var, this, i10));
            }
        }
        View view = e0Var.I;
        View view2 = n1Var.a;
        if (view == view2) {
            e0Var.o(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
