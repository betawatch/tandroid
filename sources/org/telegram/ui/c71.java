package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ c71(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                x71 x71Var = this.b;
                x71Var.y0.invalidate();
                x71Var.x0[1].setVisibility(8);
                x71Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                x71 x71Var2 = this.b;
                if (x71Var2.E0.getTag() == null) {
                    x71Var2.E0.setVisibility(4);
                }
                x71Var2.I0 = null;
                break;
            case 3:
                x71 x71Var3 = this.b;
                if (x71Var3.F0.getTag() == null) {
                    x71Var3.F0.setVisibility(4);
                }
                x71Var3.J0 = null;
                break;
            case 4:
                x71 x71Var4 = this.b;
                cc ccVar = x71Var4.i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) x71Var4.i2.getParent()).removeView(x71Var4.i2);
                    }
                    x71Var4.i2 = null;
                }
                x71Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                x71 x71Var5 = this.b;
                if (!x71Var5.q1.a()) {
                    x71Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
