package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ a71(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                v71 v71Var = this.b;
                v71Var.y0.invalidate();
                v71Var.x0[1].setVisibility(8);
                v71Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                v71 v71Var2 = this.b;
                if (v71Var2.E0.getTag() == null) {
                    v71Var2.E0.setVisibility(4);
                }
                v71Var2.I0 = null;
                break;
            case 3:
                v71 v71Var3 = this.b;
                if (v71Var3.F0.getTag() == null) {
                    v71Var3.F0.setVisibility(4);
                }
                v71Var3.J0 = null;
                break;
            case 4:
                v71 v71Var4 = this.b;
                cc ccVar = v71Var4.i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) v71Var4.i2.getParent()).removeView(v71Var4.i2);
                    }
                    v71Var4.i2 = null;
                }
                v71Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                v71 v71Var5 = this.b;
                if (!v71Var5.q1.a()) {
                    v71Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
