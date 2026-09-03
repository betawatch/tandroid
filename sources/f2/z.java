package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z implements Animator.AnimatorListener {
    public final /* synthetic */ l1 B;
    public final /* synthetic */ e0 C;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final l1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public z(e0 e0Var, l1 l1Var, int i10, float f10, float f11, float f12, float f13, int i11, l1 l1Var2) {
        this.C = e0Var;
        this.y = i11;
        this.B = l1Var2;
        this.f = i10;
        this.e = l1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new eg.b1(this, 2));
        ofFloat.setTarget(l1Var.a);
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
        l1 l1Var = this.B;
        e0 e0Var = this.C;
        if (i10 <= 0) {
            e0Var.x.a(e0Var.E, l1Var);
        } else {
            e0Var.a.add(l1Var.a);
            this.n = true;
            if (i10 > 0) {
                e0Var.E.post(new androidx.biometric.j(e0Var, this, i10));
            }
        }
        View view = e0Var.J;
        View view2 = l1Var.a;
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
