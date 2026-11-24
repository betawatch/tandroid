// default package

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class es5 implements Animator.AnimatorListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ s49 F;
    public final /* synthetic */ is5 G;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final s49 e;
    public final byte f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    /* JADX WARN: Multi-variable type inference failed */
    public es5(is5 is5Var, s49 s49Var, int i, float f, float f2, float f3, float f4, int i2, s49 s49Var2) {
        this.G = is5Var;
        this.E = i2;
        this.F = s49Var2;
        this.f = i;
        this.e = s49Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ae0(this, (byte) 7));
        ofFloat.setTarget(s49Var.a);
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
        s49 s49Var = this.F;
        is5 is5Var = this.G;
        if (i <= 0) {
            is5Var.y.a(is5Var.I, s49Var);
        } else {
            is5Var.a.add(s49Var.a);
            this.n = true;
            if (i > 0) {
                is5Var.I.post(new tq4(is5Var, this, i));
            }
        }
        View view = is5Var.N;
        View view2 = s49Var.a;
        if (view == view2 && view2 == view) {
            is5Var.N = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
