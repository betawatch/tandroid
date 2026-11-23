package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c11 b;

    public /* synthetic */ a11(c11 c11Var, int i7) {
        this.a = i7;
        this.b = c11Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                c11 c11Var = this.b;
                c11Var.O = 0.0f;
                c11Var.J = null;
                c11Var.N = false;
                c11Var.d(true, false);
                break;
        }
    }
}
