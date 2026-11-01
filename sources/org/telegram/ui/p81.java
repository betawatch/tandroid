package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ p81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                k91 k91Var = this.b;
                k91Var.y0.invalidate();
                k91Var.x0[1].setVisibility(8);
                k91Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                k91 k91Var2 = this.b;
                if (k91Var2.E0.getTag() == null) {
                    k91Var2.E0.setVisibility(4);
                }
                k91Var2.I0 = null;
                break;
            case 3:
                k91 k91Var3 = this.b;
                if (k91Var3.F0.getTag() == null) {
                    k91Var3.F0.setVisibility(4);
                }
                k91Var3.J0 = null;
                break;
            case 4:
                k91 k91Var4 = this.b;
                ic icVar = k91Var4.i2;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) k91Var4.i2.getParent()).removeView(k91Var4.i2);
                    }
                    k91Var4.i2 = null;
                }
                k91Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                k91 k91Var5 = this.b;
                if (!k91Var5.q1.a()) {
                    k91Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
