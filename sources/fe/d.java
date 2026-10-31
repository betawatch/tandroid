package fe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.b1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, float f7, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.h) {
            fVar.d(this.b + this.c, 1.0f);
            if (fVar.h) {
                fVar.h = false;
            }
            fVar.b.E(fVar.f, fVar.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
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
                b1 b1Var = (b1) this.d;
                b1Var.O = false;
                b1Var.M = true;
                b1Var.W = this.b;
                b1Var.a0 = this.c;
                b1Var.requestLayout();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((f) this.d).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
