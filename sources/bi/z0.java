package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ch;
import org.telegram.ui.bh;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z0(FrameLayout frameLayout, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.a = i10;
        this.e = frameLayout;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                if (this.b != 0) {
                    ((View) this.d).setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.e;
                b1Var.U = null;
                FrameLayout frameLayout = b1Var.f;
                LinearLayout linearLayout = (LinearLayout) this.c;
                frameLayout.removeView(linearLayout);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) this.d;
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setAlpha(1.0f);
                b1Var.h.scrollTo(0, this.b);
                b1Var.E.set(b1Var.W);
                b1Var.requestLayout();
                b1Var.invalidate();
                break;
            case 1:
                hi.k5 k5Var = (hi.k5) this.e;
                k5Var.I0 = k5Var.J0;
                k5Var.J0 = -1;
                k5Var.G0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == k5Var.L0) {
                    k5Var.L0 = null;
                    break;
                }
                break;
            case 2:
                bn bnVar = (bn) this.e;
                bnVar.g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.sa = null;
                org.telegram.messenger.g0.h3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                bnVar.m1.invalidate();
                bnVar.m1.setSkipBackgroundDrawing(false);
                bnVar.pa = false;
                bn bnVar2 = (bn) this.c;
                bnVar2.ra = 0.0f;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                bnVar2.qa = null;
                bnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                bnVar.p1.setTranslationY(0.0f);
                bnVar2.p1.setTranslationY(0.0f);
                bnVar2.p1.getAvatarImageView().setTranslationY(0.0f);
                bnVar.p1.getAvatarImageView().setScaleX(1.0f);
                bnVar.p1.getAvatarImageView().setScaleY(1.0f);
                bnVar.p1.getAvatarImageView().setAlpha(1.0f);
                bnVar2.p1.getAvatarImageView().setScaleX(1.0f);
                bnVar2.p1.getAvatarImageView().setScaleY(1.0f);
                bnVar2.p1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = bnVar2.b1;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    break;
                }
                break;
            case 3:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.e;
                v4.f1 f1Var = (v4.f1) this.c;
                kVar.X(f1Var.a);
                View view2 = f1Var.a;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                    if (r1Var.ob) {
                        r1Var.ob = false;
                        r1Var.setVisibility(0);
                    }
                    bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        aj ajVar = currentMessagesGroup.m;
                        ajVar.n = 1.0f;
                        ajVar.h = 0.0f;
                        ajVar.f = 0.0f;
                        ajVar.g = 0.0f;
                        ajVar.e = 0.0f;
                        ajVar.j = false;
                    }
                }
                if (kVar.z.remove(f1Var)) {
                    kVar.v(f1Var);
                    kVar.G();
                    break;
                }
                break;
            default:
                tg.h0 h0Var = (tg.h0) this.e;
                h0Var.Q0 = h0Var.R0;
                h0Var.R0 = -1;
                h0Var.P0.invalidate();
                View view3 = (View) this.c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == h0Var.T0) {
                    h0Var.T0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        View view;
        int i7;
        View view2;
        switch (this.a) {
            case 1:
                hi.k5 k5Var = (hi.k5) this.e;
                tg.n1 n1Var = k5Var.N0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush = k5Var.y0.getCurrentBrush();
                    if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                        n1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        n1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    n1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 2:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.e)).currentAccount;
                this.b = ls.f(i7).q(null, this.b, true);
                break;
            case 3:
                ((pi.k) this.e).getClass();
                break;
            case 4:
                tg.h0 h0Var = (tg.h0) this.e;
                tg.n1 n1Var2 = h0Var.V0;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush2 = h0Var.G0.getCurrentBrush();
                    if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                        n1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        n1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    n1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public z0(pi.k kVar, v4.f1 f1Var, int i7, View view) {
        this.a = 3;
        this.e = kVar;
        this.c = f1Var;
        this.b = i7;
        this.d = view;
    }

    public z0(bn bnVar, bn bnVar2, Runnable runnable) {
        this.a = 2;
        this.e = bnVar;
        this.c = bnVar2;
        this.d = runnable;
    }
}
