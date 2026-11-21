package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d71 extends AnimatorListenerAdapter {
    public final /* synthetic */ x71 a;

    public d71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.a;
        if (x71Var.Y0 == null) {
            x71Var.L0[0].setVisibility(4);
        }
    }
}
