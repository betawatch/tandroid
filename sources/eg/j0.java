package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.tt0;
import org.telegram.ui.xn;
import qh.b5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(sv0 sv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = sv0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.e;
                c1Var.d1 = c1Var.e1;
                c1Var.e1 = -1;
                c1Var.c1.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == c1Var.g1) {
                    c1Var.g1 = null;
                    break;
                }
                break;
            case 1:
                xn xnVar = (xn) this.e;
                xnVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow = true;
                xnVar.S9 = null;
                AndroidUtilities.runOnUIThread(new tt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                xnVar.U0.invalidate();
                xnVar.U0.setSkipBackgroundDrawing(false);
                xnVar.P9 = false;
                xn xnVar2 = (xn) this.c;
                xnVar2.R9 = 0.0f;
                xnVar2.fragmentView.invalidate();
                xnVar2.u0.invalidate();
                xnVar2.Q9 = null;
                xnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                xnVar.X0.setTranslationY(0.0f);
                xnVar2.X0.setTranslationY(0.0f);
                xnVar2.X0.getAvatarImageView().setTranslationY(0.0f);
                xnVar.X0.getAvatarImageView().setScaleX(1.0f);
                xnVar.X0.getAvatarImageView().setScaleY(1.0f);
                xnVar.X0.getAvatarImageView().setAlpha(1.0f);
                xnVar2.X0.getAvatarImageView().setScaleX(1.0f);
                xnVar2.X0.getAvatarImageView().setScaleY(1.0f);
                xnVar2.X0.getAvatarImageView().setAlpha(1.0f);
                sg sgVar = xnVar2.J0;
                if (sgVar != null) {
                    sgVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                b5 b5Var = (b5) this.e;
                b5Var.V0 = b5Var.W0;
                b5Var.W0 = -1;
                b5Var.T0.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == b5Var.Y0) {
                    b5Var.Y0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        int i10;
        View view2;
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.e;
                r2 r2Var = c1Var.i1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    dg.m currentBrush = c1Var.T0.getCurrentBrush();
                    if (!(currentBrush instanceof dg.b) && !(currentBrush instanceof dg.d)) {
                        r2Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        r2Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    r2Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                b5 b5Var = (b5) this.e;
                r2 r2Var2 = b5Var.a1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    dg.m currentBrush2 = b5Var.L0.getCurrentBrush();
                    if (!(currentBrush2 instanceof dg.b) && !(currentBrush2 instanceof dg.d)) {
                        r2Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        r2Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    r2Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public j0(xn xnVar, xn xnVar2, Runnable runnable) {
        this.a = 1;
        this.e = xnVar;
        this.c = xnVar2;
        this.d = runnable;
    }
}
