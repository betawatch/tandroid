package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.za0;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z10, boolean z11, int i10) {
        this.a = i10;
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
                actionBarLayout.d1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.h1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.P0)) {
                    viVar.P0 = null;
                    break;
                }
                break;
            case 4:
                ((za0) this.d).f2 = null;
                break;
            case 5:
                ah0 ah0Var = (ah0) this.d;
                AnimatorSet[] animatorSetArr = ah0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    ah0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ni niVar;
        u0 u0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.n[1].getParent()).removeView(kVar.n[1]);
                }
                kVar.n[1] = null;
                kVar.x0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.d1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.h1 = null;
                    break;
                }
                break;
            case 2:
                h9 h9Var = (h9) this.d;
                h9Var.G = null;
                boolean z10 = this.b;
                h9Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    a9 a9Var = h9Var.a;
                    a9Var.w = -1.0f;
                    a9Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.P0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.G0.setVisibility(4);
                        }
                        viVar.K0.setVisibility(4);
                    } else if (viVar.V0 && ((niVar = viVar.B0) == null || niVar.L())) {
                        viVar.A1.setVisibility(4);
                    }
                    if (this.c) {
                        viVar.f2();
                        viVar.R0.setVisibility(z11 ? 0 : 8);
                    }
                    viVar.P0 = null;
                    break;
                }
                break;
            case 4:
                za0 za0Var = (za0) this.d;
                cb0 cb0Var = za0Var.i2;
                if (za0Var.f2 != null) {
                    za0Var.f2 = null;
                    if (!this.b) {
                        cb0Var.F.setVisibility(4);
                        FrameLayout frameLayout = cb0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        u0 u0Var2 = cb0Var.H;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        if (this.c && (u0Var = cb0Var.G) != null) {
                            u0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        cb0Var.s.setVisibility(4);
                        u0 u0Var3 = cb0Var.G;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                ah0 ah0Var = (ah0) this.d;
                AnimatorSet[] animatorSetArr = ah0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && ah0Var.M.getAlpha() != 1.0f) {
                    ah0Var.M.setAlpha(1.0f);
                    ah0Var.M.setScaleX(1.0f);
                    ah0Var.M.setScaleY(1.0f);
                    ah0Var.M.setVisibility(0);
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
