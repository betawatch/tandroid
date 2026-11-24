// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f94 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f94(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    public final void a() {
        h94 h94Var = (h94) this.d;
        if (h94Var.h) {
            h94Var.d(this.b + this.c, 1.0f);
            if (h94Var.h) {
                h94Var.h = false;
            }
            h94Var.b.V(h94Var.f, h94Var.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                phc phcVar = (phc) this.d;
                phcVar.P = false;
                phcVar.N = true;
                phcVar.a0 = this.b;
                phcVar.b0 = this.c;
                phcVar.requestLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void b(Animator animator) {
    }
}
