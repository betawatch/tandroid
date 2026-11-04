package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ r50(s50 s50Var, int i3) {
        this.a = i3;
        this.b = s50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                s50Var.e.V1 = null;
                s50Var.requestLayout();
                break;
            default:
                s50 s50Var2 = this.b;
                s50Var2.e.V1 = null;
                s50Var2.a = false;
                break;
        }
    }
}
