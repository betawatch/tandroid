package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 implements Animator.AnimatorListener {
    public final /* synthetic */ q1 A;
    public final /* synthetic */ h0 B;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final q1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public b0(h0 h0Var, q1 q1Var, int i9, float f10, float f11, float f12, float f13, int i10, q1 q1Var2) {
        this.B = h0Var;
        this.y = i10;
        this.A = q1Var2;
        this.f = i9;
        this.e = q1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new f0(this, 0));
        ofFloat.setTarget(q1Var.a);
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
        int i9 = this.y;
        q1 q1Var = this.A;
        h0 h0Var = this.B;
        if (i9 <= 0) {
            h0Var.x.a(h0Var.D, q1Var);
        } else {
            h0Var.a.add(q1Var.a);
            this.n = true;
            if (i9 > 0) {
                h0Var.D.post(new androidx.biometric.j(h0Var, this, i9));
            }
        }
        View view = h0Var.I;
        View view2 = q1Var.a;
        if (view == view2) {
            h0Var.o(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
