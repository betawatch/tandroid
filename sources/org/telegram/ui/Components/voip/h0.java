package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ h0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.b;
                if (m0Var.getParent() != null) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    break;
                }
                break;
            case 1:
                m0 m0Var2 = this.b;
                if (m0Var2.getParent() != null) {
                    ((ViewGroup) m0Var2.getParent()).removeView(m0Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                m0 m0Var3 = this.b;
                if (m0Var3.getParent() != null) {
                    ((ViewGroup) m0Var3.getParent()).removeView(m0Var3);
                    break;
                }
                break;
        }
    }
}
