package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ed1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae1 b;

    public /* synthetic */ ed1(ae1 ae1Var, int i10) {
        this.a = i10;
        this.b = ae1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ae1 ae1Var = this.b;
                ae1Var.x0.invalidate();
                ae1Var.w0[1].setVisibility(8);
                ae1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                ae1 ae1Var2 = this.b;
                if (ae1Var2.D0.getTag() == null) {
                    ae1Var2.D0.setVisibility(4);
                }
                ae1Var2.H0 = null;
                break;
            case 3:
                ae1 ae1Var3 = this.b;
                if (ae1Var3.E0.getTag() == null) {
                    ae1Var3.E0.setVisibility(4);
                }
                ae1Var3.I0 = null;
                break;
            case 4:
                ae1 ae1Var4 = this.b;
                nc ncVar = ae1Var4.h2;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) ae1Var4.h2.getParent()).removeView(ae1Var4.h2);
                    }
                    ae1Var4.h2 = null;
                }
                ae1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                ae1 ae1Var5 = this.b;
                if (!ae1Var5.p1.a()) {
                    ae1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
