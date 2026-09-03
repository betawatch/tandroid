package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.w8;
import org.telegram.ui.og0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z4, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z4;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                actionBarLayout.a1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                ActionBarLayout.a(actionBarLayout, true);
                actionBarLayout.e1 = null;
                break;
            case 2:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                mi miVar = (mi) this.d;
                if (animator.equals(miVar.J0)) {
                    miVar.J0 = null;
                    break;
                }
                break;
            case 4:
                ((ca0) this.d).c2 = null;
                break;
            case 5:
                og0 og0Var = (og0) this.d;
                AnimatorSet[] animatorSetArr = og0Var.H;
                boolean z4 = this.b;
                if (animatorSetArr[!z4 ? 1 : 0] != null && animatorSetArr[!z4 ? 1 : 0].equals(animator)) {
                    og0Var.H[!z4 ? 1 : 0] = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ei eiVar;
        w0 w0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                l5 l5Var = kVar.n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) kVar.n[1].getParent()).removeView(kVar.n[1]);
                }
                kVar.n[1] = null;
                kVar.u0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (!this.b) {
                    actionBarLayout.a1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    ActionBarLayout.a(actionBarLayout, this.c);
                    actionBarLayout.e1 = null;
                    break;
                }
                break;
            case 2:
                w8 w8Var = (w8) this.d;
                w8Var.D = null;
                boolean z4 = this.b;
                w8Var.i0(z4 ? 1.0f : 0.0f, false);
                if (this.c) {
                    p8 p8Var = w8Var.a;
                    p8Var.w = -1.0f;
                    p8Var.setExpanded(z4);
                    break;
                }
                break;
            case 3:
                boolean z10 = this.b;
                mi miVar = (mi) this.d;
                if (animator.equals(miVar.J0)) {
                    if (!z10) {
                        if (!miVar.K) {
                            miVar.A0.setVisibility(4);
                        }
                        miVar.E0.setVisibility(4);
                    } else if (miVar.P0 && ((eiVar = miVar.v0) == null || eiVar.I())) {
                        miVar.u1.setVisibility(4);
                    }
                    if (this.c) {
                        miVar.b2();
                        miVar.L0.setVisibility(z10 ? 0 : 8);
                    }
                    miVar.J0 = null;
                    break;
                }
                break;
            case 4:
                ca0 ca0Var = (ca0) this.d;
                fa0 fa0Var = ca0Var.f2;
                if (ca0Var.c2 != null) {
                    ca0Var.c2 = null;
                    if (!this.b) {
                        fa0Var.C.setVisibility(4);
                        FrameLayout frameLayout = fa0Var.P;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = fa0Var.E;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.c && (w0Var = fa0Var.D) != null) {
                            w0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        fa0Var.s.setVisibility(4);
                        w0 w0Var3 = fa0Var.D;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                            break;
                        }
                    }
                }
                break;
            default:
                og0 og0Var = (og0) this.d;
                AnimatorSet[] animatorSetArr = og0Var.H;
                boolean z11 = this.b;
                if (animatorSetArr[!z11 ? 1 : 0] != null && animatorSetArr[!z11 ? 1 : 0].equals(animator) && !this.c && z11 && og0Var.J.getAlpha() != 1.0f) {
                    og0Var.J.setAlpha(1.0f);
                    og0Var.J.setScaleX(1.0f);
                    og0Var.J.setScaleY(1.0f);
                    og0Var.J.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public g(ActionBarLayout actionBarLayout, boolean z4) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z4;
    }
}
