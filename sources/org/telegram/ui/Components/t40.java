package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k50 b;

    public /* synthetic */ t40(k50 k50Var, int i10) {
        this.a = i10;
        this.b = k50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k50 k50Var = this.b;
                if (animator.equals(k50Var.C)) {
                    k50Var.C = null;
                    break;
                }
                break;
            case 1:
                k50 k50Var2 = this.b;
                if (k50Var2.X0 != null) {
                    k50Var2.X0 = null;
                    break;
                }
                break;
            default:
                k50 k50Var3 = this.b;
                if (animator.equals(k50Var3.S)) {
                    k50Var3.h(true);
                    k50Var3.S0 = false;
                    k50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
