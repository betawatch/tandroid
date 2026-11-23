package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x8;
import org.telegram.ui.de0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.k1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.o1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.K2)) {
                    tiVar.K2 = null;
                    break;
                }
                break;
            case 4:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    de0Var.L[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        li liVar;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                n5[] n5VarArr = kVar.n;
                n5 n5Var = n5VarArr[1];
                if (n5Var != null && n5Var.getParent() != null) {
                    ((ViewGroup) n5VarArr[1].getParent()).removeView(n5VarArr[1]);
                }
                n5VarArr[1] = null;
                kVar.y0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.k1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.o1 = null;
                    break;
                }
                break;
            case 2:
                x8 x8Var = (x8) this.d;
                x8Var.H = null;
                boolean z10 = this.b;
                x8Var.n0(false, z10 ? 1.0f : 0.0f);
                if (this.c) {
                    q8 q8Var = x8Var.a;
                    q8Var.x = -1.0f;
                    q8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                ti tiVar = (ti) this.d;
                if (animator.equals(tiVar.K2)) {
                    if (!z11) {
                        if (!tiVar.I1) {
                            tiVar.B2.setVisibility(4);
                        }
                        tiVar.F2.setVisibility(4);
                    } else if (tiVar.Q2 && ((liVar = tiVar.w2) == null || liVar.N())) {
                        tiVar.v3.setVisibility(4);
                    }
                    if (this.c) {
                        tiVar.R1();
                        tiVar.M2.setVisibility(z11 ? 0 : 8);
                    }
                    tiVar.K2 = null;
                    break;
                }
                break;
            default:
                de0 de0Var = (de0) this.d;
                AnimatorSet[] animatorSetArr = de0Var.L;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && de0Var.N.getAlpha() != 1.0f) {
                    de0Var.N.setAlpha(1.0f);
                    de0Var.N.setScaleX(1.0f);
                    de0Var.N.setScaleY(1.0f);
                    de0Var.N.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z10;
    }
}
