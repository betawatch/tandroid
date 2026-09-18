package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.y90;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                if (animator.equals(viVar.M0)) {
                    viVar.M0 = null;
                    break;
                }
                break;
            case 4:
                ((y90) this.d).f2 = null;
                break;
            case 5:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    yg0Var.K[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ni niVar;
        w0 w0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                k5 k5Var = kVar.n[1];
                if (k5Var != null && k5Var.getParent() != null) {
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
                c9 c9Var = (c9) this.d;
                c9Var.G = null;
                boolean z10 = this.b;
                c9Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    v8 v8Var = c9Var.a;
                    v8Var.w = -1.0f;
                    v8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                vi viVar = (vi) this.d;
                if (animator.equals(viVar.M0)) {
                    if (!z11) {
                        if (!viVar.N) {
                            viVar.D0.setVisibility(4);
                        }
                        viVar.H0.setVisibility(4);
                    } else if (viVar.S0 && ((niVar = viVar.y0) == null || niVar.J())) {
                        viVar.x1.setVisibility(4);
                    }
                    if (this.c) {
                        viVar.b2();
                        viVar.O0.setVisibility(z11 ? 0 : 8);
                    }
                    viVar.M0 = null;
                    break;
                }
                break;
            case 4:
                y90 y90Var = (y90) this.d;
                ba0 ba0Var = y90Var.i2;
                if (y90Var.f2 != null) {
                    y90Var.f2 = null;
                    if (!this.b) {
                        ba0Var.F.setVisibility(4);
                        FrameLayout frameLayout = ba0Var.S;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = ba0Var.H;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.c && (w0Var = ba0Var.G) != null) {
                            w0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        ba0Var.s.setVisibility(4);
                        w0 w0Var3 = ba0Var.G;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                yg0 yg0Var = (yg0) this.d;
                AnimatorSet[] animatorSetArr = yg0Var.K;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && yg0Var.M.getAlpha() != 1.0f) {
                    yg0Var.M.setAlpha(1.0f);
                    yg0Var.M.setScaleX(1.0f);
                    yg0Var.M.setScaleY(1.0f);
                    yg0Var.M.setVisibility(0);
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
