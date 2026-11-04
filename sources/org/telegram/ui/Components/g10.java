package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l10 b;

    public /* synthetic */ g10(l10 l10Var, int i3) {
        this.a = i3;
        this.b = l10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l10 l10Var = this.b;
                l10Var.b.setVisibility(8);
                l10Var.E = false;
                l10Var.F = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
