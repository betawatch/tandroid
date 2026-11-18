package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ b71(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                x71 x71Var = this.b;
                x71Var.z0.invalidate();
                x71Var.y0[1].setVisibility(8);
                x71Var.e2 = null;
                break;
            case 1:
                this.b.D0 = null;
                break;
            case 2:
                x71 x71Var2 = this.b;
                if (x71Var2.F0.getTag() == null) {
                    x71Var2.F0.setVisibility(4);
                }
                x71Var2.J0 = null;
                break;
            case 3:
                x71 x71Var3 = this.b;
                if (x71Var3.G0.getTag() == null) {
                    x71Var3.G0.setVisibility(4);
                }
                x71Var3.K0 = null;
                break;
            case 4:
                x71 x71Var4 = this.b;
                bc bcVar = x71Var4.j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) x71Var4.j2.getParent()).removeView(x71Var4.j2);
                    }
                    x71Var4.j2 = null;
                }
                x71Var4.l2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                x71 x71Var5 = this.b;
                if (!x71Var5.r1.d()) {
                    x71Var5.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
