package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ y7(l8 l8Var, int i10) {
        this.a = i10;
        this.b = l8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.C0 = null;
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
                this.b.m0 = false;
                break;
            case 1:
                l8 l8Var = this.b;
                l8Var.i0.setVisibility(4);
                l8Var.j0.setImageBitmap(null);
                l8Var.m0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
