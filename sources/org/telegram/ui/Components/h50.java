package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x50 b;

    public /* synthetic */ h50(x50 x50Var, int i10) {
        this.a = i10;
        this.b = x50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x50 x50Var = this.b;
                if (animator.equals(x50Var.D)) {
                    x50Var.D = null;
                    break;
                }
                break;
            case 1:
                x50 x50Var2 = this.b;
                if (x50Var2.Y0 != null) {
                    x50Var2.Y0 = null;
                    break;
                }
                break;
            default:
                x50 x50Var3 = this.b;
                if (animator.equals(x50Var3.T)) {
                    x50Var3.h(true);
                    x50Var3.T0 = false;
                    x50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
