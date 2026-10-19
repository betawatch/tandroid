package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class c30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ c30(i30 i30Var, int i10) {
        this.a = i10;
        this.b = i30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i30 i30Var = this.b;
                i30Var.b.setVisibility(8);
                i30Var.y = false;
                i30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
