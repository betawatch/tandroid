package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.z8;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.P0)) {
                    yiVar.P0 = null;
                    break;
                }
                break;
            case 4:
                ((ab0) this.d).f2 = null;
                break;
            case 5:
                wg0 wg0Var = (wg0) this.d;
                AnimatorSet[] animatorSetArr = wg0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    wg0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qi qiVar;
        v0 v0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                j5 j5Var = kVar.n[1];
                if (j5Var != null && j5Var.getParent() != null) {
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
                g9 g9Var = (g9) this.d;
                g9Var.G = null;
                boolean z10 = this.b;
                g9Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    z8 z8Var = g9Var.a;
                    z8Var.w = -1.0f;
                    z8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                yi yiVar = (yi) this.d;
                if (animator.equals(yiVar.P0)) {
                    if (!z11) {
                        if (!yiVar.N) {
                            yiVar.G0.setVisibility(4);
                        }
                        yiVar.K0.setVisibility(4);
                    } else if (yiVar.V0 && ((qiVar = yiVar.B0) == null || qiVar.L())) {
                        yiVar.A1.setVisibility(4);
                    }
                    if (this.c) {
                        yiVar.f2();
                        yiVar.R0.setVisibility(z11 ? 0 : 8);
                    }
                    yiVar.P0 = null;
                    break;
                }
                break;
            case 4:
                ab0 ab0Var = (ab0) this.d;
                db0 db0Var = ab0Var.i2;
                if (ab0Var.f2 != null) {
                    ab0Var.f2 = null;
                    if (!this.b) {
                        db0Var.F.setVisibility(4);
                        FrameLayout frameLayout = db0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        v0 v0Var2 = db0Var.H;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        if (this.c && (v0Var = db0Var.G) != null) {
                            v0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        db0Var.s.setVisibility(4);
                        v0 v0Var3 = db0Var.G;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                wg0 wg0Var = (wg0) this.d;
                AnimatorSet[] animatorSetArr = wg0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && wg0Var.M.getAlpha() != 1.0f) {
                    wg0Var.M.setAlpha(1.0f);
                    wg0Var.M.setScaleX(1.0f);
                    wg0Var.M.setScaleY(1.0f);
                    wg0Var.M.setVisibility(0);
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
