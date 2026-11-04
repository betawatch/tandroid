package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ q61(l71 l71Var, int i3) {
        this.a = i3;
        this.b = l71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                l71 l71Var = this.b;
                l71Var.z0.invalidate();
                l71Var.y0[1].setVisibility(8);
                l71Var.e2 = null;
                break;
            case 1:
                this.b.D0 = null;
                break;
            case 2:
                l71 l71Var2 = this.b;
                if (l71Var2.F0.getTag() == null) {
                    l71Var2.F0.setVisibility(4);
                }
                l71Var2.J0 = null;
                break;
            case 3:
                l71 l71Var3 = this.b;
                if (l71Var3.G0.getTag() == null) {
                    l71Var3.G0.setVisibility(4);
                }
                l71Var3.K0 = null;
                break;
            case 4:
                l71 l71Var4 = this.b;
                ac acVar = l71Var4.j2;
                if (acVar != null) {
                    if (acVar.getParent() != null) {
                        ((ViewGroup) l71Var4.j2.getParent()).removeView(l71Var4.j2);
                    }
                    l71Var4.j2 = null;
                }
                l71Var4.l2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                l71 l71Var5 = this.b;
                if (!l71Var5.r1.a()) {
                    l71Var5.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
