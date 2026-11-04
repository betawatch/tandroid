package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.th;
import org.telegram.ui.xd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z10, boolean z11, int i3) {
        this.a = i3;
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
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.H2)) {
                    biVar.H2 = null;
                    break;
                }
                break;
            case 4:
                xd0 xd0Var = (xd0) this.d;
                AnimatorSet[] animatorSetArr = xd0Var.L;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    xd0Var.L[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        th thVar;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                k5[] k5VarArr = kVar.n;
                k5 k5Var = k5VarArr[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
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
                r8 r8Var = (r8) this.d;
                r8Var.H = null;
                boolean z10 = this.b;
                r8Var.n0(false, z10 ? 1.0f : 0.0f);
                if (this.c) {
                    k8 k8Var = r8Var.a;
                    k8Var.x = -1.0f;
                    k8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                bi biVar = (bi) this.d;
                if (animator.equals(biVar.H2)) {
                    if (!z11) {
                        if (!biVar.F1) {
                            biVar.y2.setVisibility(4);
                        }
                        biVar.C2.setVisibility(4);
                    } else if (biVar.N2 && ((thVar = biVar.t2) == null || thVar.M())) {
                        biVar.s3.setVisibility(4);
                    }
                    if (this.c) {
                        biVar.Q1();
                        biVar.J2.setVisibility(z11 ? 0 : 8);
                    }
                    biVar.H2 = null;
                    break;
                }
                break;
            default:
                xd0 xd0Var = (xd0) this.d;
                AnimatorSet[] animatorSetArr = xd0Var.L;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && xd0Var.N.getAlpha() != 1.0f) {
                    xd0Var.N.setAlpha(1.0f);
                    xd0Var.N.setScaleX(1.0f);
                    xd0Var.N.setScaleY(1.0f);
                    xd0Var.N.setVisibility(0);
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
