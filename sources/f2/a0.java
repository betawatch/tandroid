package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a0 implements Animator.AnimatorListener {
    public final /* synthetic */ o1 A;
    public final /* synthetic */ f0 B;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final o1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public a0(f0 f0Var, o1 o1Var, int i10, float f10, float f11, float f12, float f13, int i11, o1 o1Var2) {
        this.B = f0Var;
        this.y = i11;
        this.A = o1Var2;
        this.f = i10;
        this.e = o1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ag.q1(this, 2));
        ofFloat.setTarget(o1Var.a);
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
        o1 o1Var = this.A;
        f0 f0Var = this.B;
        if (i10 <= 0) {
            f0Var.x.a(f0Var.D, o1Var);
        } else {
            f0Var.a.add(o1Var.a);
            this.n = true;
            if (i10 > 0) {
                f0Var.D.post(new a9.o(f0Var, this, i10));
            }
        }
        View view = f0Var.I;
        View view2 = o1Var.a;
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
