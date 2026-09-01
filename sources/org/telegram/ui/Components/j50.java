package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z50 b;

    public /* synthetic */ j50(z50 z50Var, int i10) {
        this.a = i10;
        this.b = z50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z50 z50Var = this.b;
                if (animator.equals(z50Var.D)) {
                    z50Var.D = null;
                    break;
                }
                break;
            case 1:
                z50 z50Var2 = this.b;
                if (z50Var2.Y0 != null) {
                    z50Var2.Y0 = null;
                    break;
                }
                break;
            default:
                z50 z50Var3 = this.b;
                if (animator.equals(z50Var3.T)) {
                    z50Var3.h(true);
                    z50Var3.T0 = false;
                    z50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
