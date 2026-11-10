package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.l8;
import org.telegram.ui.Components.s8;
import org.telegram.ui.Components.uh;
import org.telegram.ui.fe0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, boolean z9, boolean z10, int i7) {
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
                ci ciVar = (ci) this.d;
                if (animator.equals(ciVar.J2)) {
                    ciVar.J2 = null;
                    break;
                }
                break;
            case 4:
                fe0 fe0Var = (fe0) this.d;
                AnimatorSet[] animatorSetArr = fe0Var.K;
                boolean z9 = this.b;
                if (animatorSetArr[!z9 ? 1 : 0] != null && animatorSetArr[!z9 ? 1 : 0].equals(animator)) {
                    fe0Var.K[!z9 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uh uhVar;
        switch (this.a) {
            case 0:
                l lVar = (l) this.d;
                m5[] m5VarArr = lVar.n;
                m5 m5Var = m5VarArr[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
                }
                m5VarArr[1] = null;
                lVar.x0 = false;
                if (this.b && this.c) {
                    lVar.r.setVisibility(8);
                }
                lVar.requestLayout();
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
                s8 s8Var = (s8) this.d;
                s8Var.G = null;
                boolean z9 = this.b;
                s8Var.n0(false, z9 ? 1.0f : 0.0f);
                if (this.c) {
                    l8 l8Var = s8Var.a;
                    l8Var.x = -1.0f;
                    l8Var.setExpanded(z9);
                    break;
                }
                break;
            case 3:
                boolean z10 = this.b;
                ci ciVar = (ci) this.d;
                if (animator.equals(ciVar.J2)) {
                    if (!z10) {
                        if (!ciVar.H1) {
                            ciVar.A2.setVisibility(4);
                        }
                        ciVar.E2.setVisibility(4);
                    } else if (ciVar.P2 && ((uhVar = ciVar.v2) == null || uhVar.M())) {
                        ciVar.u3.setVisibility(4);
                    }
                    if (this.c) {
                        ciVar.Q1();
                        ciVar.L2.setVisibility(z10 ? 0 : 8);
                    }
                    ciVar.J2 = null;
                    break;
                }
                break;
            default:
                fe0 fe0Var = (fe0) this.d;
                AnimatorSet[] animatorSetArr = fe0Var.K;
                boolean z11 = this.b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.c && z11 && fe0Var.M.getAlpha() != 1.0f) {
                    fe0Var.M.setAlpha(1.0f);
                    fe0Var.M.setScaleX(1.0f);
                    fe0Var.M.setScaleY(1.0f);
                    fe0Var.M.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public h(ActionBarLayout actionBarLayout, boolean z9) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z9;
    }
}
