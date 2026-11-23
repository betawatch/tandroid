package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t3 extends AnimatorListenerAdapter {
    public final /* synthetic */ v3 a;

    public t3(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.a;
        if (v3Var.r) {
            v3Var.d.setVisibility(4);
        } else {
            v3Var.e.setVisibility(4);
        }
    }
}
