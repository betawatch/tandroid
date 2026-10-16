package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m30 b;

    public /* synthetic */ h30(m30 m30Var, int i10) {
        this.a = i10;
        this.b = m30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m30 m30Var = this.b;
                m30Var.b.setVisibility(8);
                m30Var.y = false;
                m30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
