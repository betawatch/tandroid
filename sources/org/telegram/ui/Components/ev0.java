package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ev0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ ev0(fv0 fv0Var, int i7) {
        this.a = i7;
        this.b = fv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fv0 fv0Var = this.b;
                fv0Var.E = 1.0f;
                fv0Var.invalidate();
                fv0Var.H = null;
                break;
            case 1:
                fv0 fv0Var2 = this.b;
                fv0Var2.m(((Float) fv0Var2.w.getAnimatedValue()).floatValue());
                fv0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.G = null;
                break;
        }
    }
}
