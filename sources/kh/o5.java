package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.kt0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o5(yu0 yu0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i9, int i10) {
        this.a = i10;
        this.e = yu0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.e;
                g6Var.U0 = g6Var.V0;
                g6Var.V0 = -1;
                g6Var.S0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == g6Var.X0) {
                    g6Var.X0 = null;
                    break;
                }
                break;
            case 1:
                qn qnVar = (qn) this.e;
                qnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow = true;
                qnVar.R9 = null;
                AndroidUtilities.runOnUIThread(new kt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                qnVar.T0.invalidate();
                qnVar.T0.setSkipBackgroundDrawing(false);
                qnVar.O9 = false;
                qn qnVar2 = (qn) this.c;
                qnVar2.Q9 = 0.0f;
                qnVar2.fragmentView.invalidate();
                qnVar2.t0.invalidate();
                qnVar2.P9 = null;
                qnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                qnVar.W0.setTranslationY(0.0f);
                qnVar2.W0.setTranslationY(0.0f);
                qnVar2.W0.getAvatarImageView().setTranslationY(0.0f);
                qnVar.W0.getAvatarImageView().setScaleX(1.0f);
                qnVar.W0.getAvatarImageView().setScaleY(1.0f);
                qnVar.W0.getAvatarImageView().setAlpha(1.0f);
                qnVar2.W0.getAvatarImageView().setScaleX(1.0f);
                qnVar2.W0.getAvatarImageView().setScaleY(1.0f);
                qnVar2.W0.getAvatarImageView().setAlpha(1.0f);
                sg sgVar = qnVar2.I0;
                if (sgVar != null) {
                    sgVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.e;
                l0Var.c1 = l0Var.d1;
                l0Var.d1 = -1;
                l0Var.b1.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == l0Var.f1) {
                    l0Var.f1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        int i9;
        View view2;
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.e;
                yf.w1 w1Var = g6Var.Z0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    xf.m currentBrush = g6Var.K0.getCurrentBrush();
                    if (!(currentBrush instanceof xf.b) && !(currentBrush instanceof xf.d)) {
                        w1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        w1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    w1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i9 = ((org.telegram.ui.ActionBar.o2) ((qn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i9).setAnimationInProgress(this.b, null);
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.e;
                yf.w1 w1Var2 = l0Var.h1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    xf.m currentBrush2 = l0Var.S0.getCurrentBrush();
                    if (!(currentBrush2 instanceof xf.b) && !(currentBrush2 instanceof xf.d)) {
                        w1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        w1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    w1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public o5(qn qnVar, qn qnVar2, Runnable runnable) {
        this.a = 1;
        this.e = qnVar;
        this.c = qnVar2;
        this.d = runnable;
    }
}
