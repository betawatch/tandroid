package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.yt0;
import org.telegram.ui.zn;
import ph.c5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(rv0 rv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = rv0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.e;
                e1Var.d1 = e1Var.e1;
                e1Var.e1 = -1;
                e1Var.c1.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == e1Var.g1) {
                    e1Var.g1 = null;
                    break;
                }
                break;
            case 1:
                zn znVar = (zn) this.e;
                znVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow = true;
                znVar.S9 = null;
                AndroidUtilities.runOnUIThread(new yt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                znVar.U0.invalidate();
                znVar.U0.setSkipBackgroundDrawing(false);
                znVar.P9 = false;
                zn znVar2 = (zn) this.c;
                znVar2.R9 = 0.0f;
                znVar2.fragmentView.invalidate();
                znVar2.u0.invalidate();
                znVar2.Q9 = null;
                znVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                znVar.X0.setTranslationY(0.0f);
                znVar2.X0.setTranslationY(0.0f);
                znVar2.X0.getAvatarImageView().setTranslationY(0.0f);
                znVar.X0.getAvatarImageView().setScaleX(1.0f);
                znVar.X0.getAvatarImageView().setScaleY(1.0f);
                znVar.X0.getAvatarImageView().setAlpha(1.0f);
                znVar2.X0.getAvatarImageView().setScaleX(1.0f);
                znVar2.X0.getAvatarImageView().setScaleY(1.0f);
                znVar2.X0.getAvatarImageView().setAlpha(1.0f);
                sg sgVar = znVar2.J0;
                if (sgVar != null) {
                    sgVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                c5 c5Var = (c5) this.e;
                c5Var.V0 = c5Var.W0;
                c5Var.W0 = -1;
                c5Var.T0.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == c5Var.Y0) {
                    c5Var.Y0 = null;
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
                e1 e1Var = (e1) this.e;
                t2 t2Var = e1Var.i1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    cg.m currentBrush = e1Var.T0.getCurrentBrush();
                    if (!(currentBrush instanceof cg.b) && !(currentBrush instanceof cg.d)) {
                        t2Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        t2Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    t2Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((zn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                c5 c5Var = (c5) this.e;
                t2 t2Var2 = c5Var.a1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    cg.m currentBrush2 = c5Var.L0.getCurrentBrush();
                    if (!(currentBrush2 instanceof cg.b) && !(currentBrush2 instanceof cg.d)) {
                        t2Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        t2Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    t2Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public l0(zn znVar, zn znVar2, Runnable runnable) {
        this.a = 1;
        this.e = znVar;
        this.c = znVar2;
        this.d = runnable;
    }
}
