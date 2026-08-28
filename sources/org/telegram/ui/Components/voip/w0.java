package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ w0(a1 a1Var, int i9) {
        this.a = i9;
        this.b = a1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                a1 a1Var = this.b;
                if (a1Var.getParent() != null) {
                    ((ViewGroup) a1Var.getParent()).removeView(a1Var);
                    break;
                }
                break;
            case 1:
                a1 a1Var2 = this.b;
                if (a1Var2.getParent() != null) {
                    ((ViewGroup) a1Var2.getParent()).removeView(a1Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                a1 a1Var3 = this.b;
                if (a1Var3.getParent() != null) {
                    ((ViewGroup) a1Var3.getParent()).removeView(a1Var3);
                    break;
                }
                break;
        }
    }
}
