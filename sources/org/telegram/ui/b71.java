package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ b71(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                w71 w71Var = this.b;
                w71Var.y0.invalidate();
                w71Var.x0[1].setVisibility(8);
                w71Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                w71 w71Var2 = this.b;
                if (w71Var2.E0.getTag() == null) {
                    w71Var2.E0.setVisibility(4);
                }
                w71Var2.I0 = null;
                break;
            case 3:
                w71 w71Var3 = this.b;
                if (w71Var3.F0.getTag() == null) {
                    w71Var3.F0.setVisibility(4);
                }
                w71Var3.J0 = null;
                break;
            case 4:
                w71 w71Var4 = this.b;
                cc ccVar = w71Var4.i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) w71Var4.i2.getParent()).removeView(w71Var4.i2);
                    }
                    w71Var4.i2 = null;
                }
                w71Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                w71 w71Var5 = this.b;
                if (!w71Var5.q1.a()) {
                    w71Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
