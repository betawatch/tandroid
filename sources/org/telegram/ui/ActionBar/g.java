package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.vh;
import org.telegram.ui.ce0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z9, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z9;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.j1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.n1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                di diVar = (di) this.d;
                if (animator.equals(diVar.G2)) {
                    diVar.G2 = null;
                    break;
                }
                break;
            case 4:
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.K;
                boolean z9 = this.b;
                if (animatorSetArr[!z9 ? 1 : 0] != null && animatorSetArr[!z9 ? 1 : 0].equals(animator)) {
                    ce0Var.K[!z9 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vh vhVar;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                k5[] k5VarArr = kVar.n;
                k5 k5Var = k5VarArr[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
                kVar.x0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.j1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.n1 = null;
                    break;
                }
                break;
            case 2:
                t8 t8Var = (t8) this.d;
                t8Var.G = null;
                boolean z9 = this.b;
                t8Var.n0(false, z9 ? 1.0f : 0.0f);
                if (this.c) {
                    m8 m8Var = t8Var.a;
                    m8Var.x = -1.0f;
                    m8Var.setExpanded(z9);
                    break;
                }
                break;
            case 3:
                boolean z10 = this.b;
                di diVar = (di) this.d;
                if (animator.equals(diVar.G2)) {
                    if (!z10) {
                        if (!diVar.E1) {
                            diVar.x2.setVisibility(4);
                        }
                        diVar.B2.setVisibility(4);
                    } else if (diVar.M2 && ((vhVar = diVar.s2) == null || vhVar.M())) {
                        diVar.r3.setVisibility(4);
                    }
                    if (this.c) {
                        diVar.Q1();
                        diVar.I2.setVisibility(z10 ? 0 : 8);
                    }
                    diVar.G2 = null;
                    break;
                }
                break;
            default:
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.K;
                boolean z11 = this.b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.c && z11 && ce0Var.M.getAlpha() != 1.0f) {
                    ce0Var.M.setAlpha(1.0f);
                    ce0Var.M.setScaleX(1.0f);
                    ce0Var.M.setScaleY(1.0f);
                    ce0Var.M.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z9) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z9;
    }
}
