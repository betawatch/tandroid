package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ l0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.s.setVisibility(4);
                v0Var.v = null;
                break;
            default:
                this.b.v = null;
                break;
        }
    }
}
