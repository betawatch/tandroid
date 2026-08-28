package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.w8;
import org.telegram.ui.fg0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, boolean z10, boolean z11, int i9) {
        this.a = i9;
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
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.I0)) {
                    kiVar.I0 = null;
                    break;
                }
                break;
            case 4:
                ((h90) this.d).b2 = null;
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
        ci ciVar;
        w0 w0Var;
        switch (this.a) {
            case 0:
                k kVar = (k) this.d;
                h5 h5Var = kVar.n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar.n[1].getParent()).removeView(kVar.n[1]);
                }
                kVar.n[1] = null;
                kVar.t0 = false;
                if (this.b && this.c) {
                    kVar.r.setVisibility(8);
                }
                kVar.requestLayout();
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
                w8 w8Var = (w8) this.d;
                w8Var.C = null;
                boolean z10 = this.b;
                w8Var.h0(z10 ? 1.0f : 0.0f, false);
                if (this.c) {
                    p8 p8Var = w8Var.a;
                    p8Var.w = -1.0f;
                    p8Var.setExpanded(z10);
                    break;
                }
                break;
            case 3:
                boolean z11 = this.b;
                ki kiVar = (ki) this.d;
                if (animator.equals(kiVar.I0)) {
                    if (!z11) {
                        if (!kiVar.J) {
                            kiVar.z0.setVisibility(4);
                        }
                        kiVar.D0.setVisibility(4);
                    } else if (kiVar.O0 && ((ciVar = kiVar.u0) == null || ciVar.I())) {
                        kiVar.t1.setVisibility(4);
                    }
                    if (this.c) {
                        kiVar.b2();
                        kiVar.K0.setVisibility(z11 ? 0 : 8);
                    }
                    kiVar.I0 = null;
                    break;
                }
                break;
            case 4:
                h90 h90Var = (h90) this.d;
                k90 k90Var = h90Var.e2;
                if (h90Var.b2 != null) {
                    h90Var.b2 = null;
                    if (!this.b) {
                        k90Var.B.setVisibility(4);
                        FrameLayout frameLayout = k90Var.O;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        w0 w0Var2 = k90Var.D;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        if (this.c && (w0Var = k90Var.C) != null) {
                            w0Var.setVisibility(8);
                            break;
                        }
                    } else {
                        k90Var.s.setVisibility(4);
                        w0 w0Var3 = k90Var.C;
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

    public g(ActionBarLayout actionBarLayout, boolean z10) {
        this.a = 1;
        this.d = actionBarLayout;
        this.c = z10;
    }
}
