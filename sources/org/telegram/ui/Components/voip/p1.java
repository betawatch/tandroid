package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p1(Object obj, float f10, float f11, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    public void a() {
        td.c cVar = (td.c) this.d;
        if (cVar.g) {
            cVar.d(this.b + this.c, 1.0f);
            if (cVar.g) {
                cVar.g = false;
            }
            cVar.b.B(cVar.e, cVar.a);
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
                s1Var.K = false;
                s1Var.I = true;
                s1Var.S = this.b;
                s1Var.T = this.c;
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
                ((td.c) this.d).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
