package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q1(Object obj, float f9, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f9;
        this.c = f10;
    }

    public void a() {
        vd.c cVar = (vd.c) this.d;
        if (cVar.g) {
            cVar.d(this.b + this.c, 1.0f);
            if (cVar.g) {
                cVar.g = false;
            }
            cVar.b.z(cVar.e, cVar.a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
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
                t1 t1Var = (t1) this.d;
                t1Var.K = false;
                t1Var.I = true;
                t1Var.S = this.b;
                t1Var.T = this.c;
                t1Var.requestLayout();
                break;
            default:
                a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ((vd.c) this.d).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
