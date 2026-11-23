package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ s7(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.w2 = null;
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
                this.b.g2 = false;
                break;
            case 1:
                e8 e8Var = this.b;
                e8Var.c2.setVisibility(4);
                e8Var.d2.setImageBitmap(null);
                e8Var.g2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
