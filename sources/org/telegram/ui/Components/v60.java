package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w60 b;

    public /* synthetic */ v60(w60 w60Var, int i10) {
        this.a = i10;
        this.b = w60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w60 w60Var = this.b;
                w60Var.e.Z = null;
                w60Var.requestLayout();
                break;
            default:
                w60 w60Var2 = this.b;
                w60Var2.e.Z = null;
                w60Var2.a = false;
                break;
        }
    }
}
