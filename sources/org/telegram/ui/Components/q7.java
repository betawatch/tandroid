package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ q7(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.z0 = null;
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
                this.b.j0 = false;
                break;
            case 1:
                c8 c8Var = this.b;
                c8Var.f0.setVisibility(4);
                c8Var.g0.setImageBitmap(null);
                c8Var.j0 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
