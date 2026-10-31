package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ n0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.L = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.a) {
            case 0:
                jf.f fVar = this.b.O;
                if (fVar != null && (view = fVar.j) != null) {
                    fVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z10);
                break;
        }
    }
}
