package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.q8;
import org.telegram.ui.ce0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.K2)) {
                    kiVar.K2 = null;
                    break;
                }
                break;
            case 4:
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.L;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ce0Var.L[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ci ciVar;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                j5[] j5VarArr = kVar.n;
                j5 j5Var = j5VarArr[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) j5VarArr[1].getParent()).removeView(j5VarArr[1]);
                }
                j5VarArr[1] = null;
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
                q8 q8Var = (q8) this.d;
                q8Var.H = null;
                boolean z10 = this.b;
                q8Var.n0(false, z10 ? 1.0f : 0.0f);
                if (this.c) {
                    j8 j8Var = q8Var.a;
                    j8Var.x = -1.0f;
                    j8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.K2)) {
                    if (!z11) {
                        if (!kiVar.I1) {
                            kiVar.B2.setVisibility(4);
                        }
                        kiVar.F2.setVisibility(4);
                    } else if (kiVar.Q2 && ((ciVar = kiVar.w2) == null || ciVar.N())) {
                        kiVar.v3.setVisibility(4);
                    }
                    if (this.c) {
                        kiVar.Q1();
                        kiVar.M2.setVisibility(z11 ? 0 : 8);
                    }
                    kiVar.K2 = null;
                    break;
                }
                break;
            default:
                ce0 ce0Var = (ce0) this.d;
                AnimatorSet[] animatorSetArr = ce0Var.L;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && ce0Var.N.getAlpha() != 1.0f) {
                    ce0Var.N.setAlpha(1.0f);
                    ce0Var.N.setScaleX(1.0f);
                    ce0Var.N.setScaleY(1.0f);
                    ce0Var.N.setVisibility(0);
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
