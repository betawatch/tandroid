package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;

    public /* synthetic */ l30(q30 q30Var, int i10) {
        this.a = i10;
        this.b = q30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q30 q30Var = this.b;
                q30Var.b.setVisibility(8);
                q30Var.y = false;
                q30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
