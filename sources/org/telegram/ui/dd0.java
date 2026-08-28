package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ dd0(fg0 fg0Var, int i9) {
        this.a = i9;
        this.b = fg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fg0 fg0Var = this.b;
                if (fg0Var.d == animator) {
                    fg0Var.d = null;
                    break;
                }
                break;
            default:
                fg0 fg0Var2 = this.b;
                fg0Var2.c.setVisibility(8);
                if (fg0Var2.d == animator) {
                    fg0Var2.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
