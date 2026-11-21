package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
