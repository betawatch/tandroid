package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wm0 c;

    public /* synthetic */ bm0(wm0 wm0Var, boolean z10, int i9) {
        this.a = i9;
        this.c = wm0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.c;
                AnimatorSet animatorSet = wm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wm0Var.I = null;
                    break;
                }
                break;
            default:
                wm0 wm0Var2 = this.c;
                AnimatorSet animatorSet2 = wm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wm0Var2.I = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.c;
                AnimatorSet animatorSet = wm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        wm0Var.J.setVisibility(4);
                        break;
                    } else {
                        wm0Var.H.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                wm0 wm0Var2 = this.c;
                AnimatorSet animatorSet2 = wm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        wm0Var2.L.setVisibility(4);
                        break;
                    } else {
                        wm0Var2.K.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
