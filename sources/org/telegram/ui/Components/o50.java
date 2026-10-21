package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class o50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ o50(m60 m60Var, int i10) {
        this.a = i10;
        this.b = m60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m60 m60Var = this.b;
                if (animator.equals(m60Var.L)) {
                    m60Var.L = null;
                    break;
                }
                break;
            case 1:
                m60 m60Var2 = this.b;
                if (m60Var2.l1 != null) {
                    m60Var2.l1 = null;
                    break;
                }
                break;
            default:
                m60 m60Var3 = this.b;
                if (animator.equals(m60Var3.e0)) {
                    m60Var3.c(true);
                    m60Var3.g1 = false;
                    m60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
