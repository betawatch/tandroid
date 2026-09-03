package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p1(Object obj, float f10, float f11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    public void a() {
        xd.c cVar = (xd.c) this.d;
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
                s1 s1Var = (s1) this.d;
                s1Var.L = false;
                s1Var.J = true;
                s1Var.T = this.b;
                s1Var.U = this.c;
                s1Var.requestLayout();
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
                ((xd.c) this.d).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
