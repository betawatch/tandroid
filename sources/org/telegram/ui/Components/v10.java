package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a20 b;

    public /* synthetic */ v10(a20 a20Var, int i7) {
        this.a = i7;
        this.b = a20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a20 a20Var = this.b;
                a20Var.b.setVisibility(8);
                a20Var.F = false;
                a20Var.G = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
