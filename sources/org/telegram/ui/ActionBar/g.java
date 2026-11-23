package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.y8;
import org.telegram.ui.de0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                ui uiVar = (ui) this.d;
                if (animator.equals(uiVar.K2)) {
                    uiVar.K2 = null;
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
        mi miVar;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                m5[] m5VarArr = kVar.n;
                m5 m5Var = m5VarArr[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
                }
                m5VarArr[1] = null;
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
                y8 y8Var = (y8) this.d;
                y8Var.H = null;
                boolean z10 = this.b;
                y8Var.n0(false, z10 ? 1.0f : 0.0f);
                if (this.c) {
                    r8 r8Var = y8Var.a;
                    r8Var.x = -1.0f;
                    r8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                ui uiVar = (ui) this.d;
                if (animator.equals(uiVar.K2)) {
                    if (!z11) {
                        if (!uiVar.I1) {
                            uiVar.B2.setVisibility(4);
                        }
                        uiVar.F2.setVisibility(4);
                    } else if (uiVar.Q2 && ((miVar = uiVar.w2) == null || miVar.N())) {
                        uiVar.v3.setVisibility(4);
                    }
                    if (this.c) {
                        uiVar.R1();
                        uiVar.M2.setVisibility(z11 ? 0 : 8);
                    }
                    uiVar.K2 = null;
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
