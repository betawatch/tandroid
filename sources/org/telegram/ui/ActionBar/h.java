package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.y90;
import org.telegram.ui.fg0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, boolean z10, boolean z11, int i10) {
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
                actionBarLayout.Z0 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.d1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                ni niVar = (ni) this.d;
                if (animator.equals(niVar.I0)) {
                    niVar.I0 = null;
                    break;
                }
                break;
            case 4:
                ((v90) this.d).b2 = null;
                break;
            case 5:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.G;
                boolean z10 = this.b;
                if (animatorSetArr[!z10 ? 1 : 0] != null && animatorSetArr[!z10 ? 1 : 0].equals(animator)) {
                    fg0Var.G[!z10 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fi fiVar;
        w0 w0Var;
        switch (this.a) {
            case 0:
                l lVar = (l) this.d;
                h5 h5Var = lVar.n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) lVar.n[1].getParent()).removeView(lVar.n[1]);
                }
                lVar.n[1] = null;
                lVar.t0 = false;
                if (this.b && this.c) {
                    lVar.r.setVisibility(8);
                }
                lVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.Z0 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.d1 = null;
                    break;
                }
                break;
            case 2:
                b9 b9Var = (b9) this.d;
                b9Var.C = null;
                boolean z10 = this.b;
                b9Var.i0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    u8 u8Var = b9Var.a;
                    u8Var.w = -1.0f;
                    u8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                ni niVar = (ni) this.d;
                if (animator.equals(niVar.I0)) {
                    if (!z11) {
                        if (!niVar.J) {
                            niVar.z0.setVisibility(4);
                        }
                        niVar.D0.setVisibility(4);
                    } else if (niVar.O0 && ((fiVar = niVar.u0) == null || fiVar.I())) {
                        niVar.t1.setVisibility(4);
                    }
                    if (this.c) {
                        niVar.b2();
                        niVar.K0.setVisibility(z11 ? 0 : 8);
                    }
                    niVar.I0 = null;
                    break;
                }
                break;
            case 4:
                v90 v90Var = (v90) this.d;
                y90 y90Var = v90Var.e2;
                if (v90Var.b2 != null) {
                    v90Var.b2 = null;
                    if (!this.b) {
                        y90Var.B.setVisibility(4);
                        FrameLayout frameLayout = y90Var.O;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = y90Var.D;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.c && (w0Var = y90Var.C) != null) {
                            w0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        y90Var.s.setVisibility(4);
                        w0 w0Var3 = y90Var.C;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                fg0 fg0Var = (fg0) this.d;
                AnimatorSet[] animatorSetArr = fg0Var.G;
                boolean z12 = this.b;
                if (animatorSetArr[!z12 ? 1 : 0] != null && animatorSetArr[!z12 ? 1 : 0].equals(animator) && !this.c && z12 && fg0Var.I.getAlpha() != 1.0f) {
                    fg0Var.I.setAlpha(1.0f);
                    fg0Var.I.setScaleX(1.0f);
                    fg0Var.I.setScaleY(1.0f);
                    fg0Var.I.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public h(ActionBarLayout actionBarLayout, boolean z10) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z10;
    }
}
