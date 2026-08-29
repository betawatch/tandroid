package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ c50(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                if (animator.equals(s50Var.C)) {
                    s50Var.C = null;
                    break;
                }
                break;
            case 1:
                s50 s50Var2 = this.b;
                if (s50Var2.X0 != null) {
                    s50Var2.X0 = null;
                    break;
                }
                break;
            default:
                s50 s50Var3 = this.b;
                if (animator.equals(s50Var3.S)) {
                    s50Var3.h(true);
                    s50Var3.S0 = false;
                    s50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
