package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ch;
import org.telegram.ui.mu0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class y5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y5(bw0 bw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = bw0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.e;
                r6Var.Y0 = r6Var.Z0;
                r6Var.Z0 = -1;
                r6Var.W0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == r6Var.b1) {
                    r6Var.b1 = null;
                    break;
                }
                break;
            case 1:
                zn znVar = (zn) this.e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                AndroidUtilities.runOnUIThread(new mu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                znVar.X0.invalidate();
                znVar.X0.setSkipBackgroundDrawing(false);
                znVar.S9 = false;
                zn znVar2 = (zn) this.c;
                znVar2.U9 = 0.0f;
                znVar2.fragmentView.invalidate();
                znVar2.x0.invalidate();
                znVar2.T9 = null;
                znVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                znVar.a1.setTranslationY(0.0f);
                znVar2.a1.setTranslationY(0.0f);
                znVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                znVar.a1.getAvatarImageView().setScaleX(1.0f);
                znVar.a1.getAvatarImageView().setScaleY(1.0f);
                znVar.a1.getAvatarImageView().setAlpha(1.0f);
                znVar2.a1.getAvatarImageView().setScaleX(1.0f);
                znVar2.a1.getAvatarImageView().setScaleY(1.0f);
                znVar2.a1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = znVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                n0Var.g1 = n0Var.h1;
                n0Var.h1 = -1;
                n0Var.f1.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == n0Var.j1) {
                    n0Var.j1 = null;
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
                r6 r6Var = (r6) this.e;
                qg.x1 x1Var = r6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush = r6Var.O0.getCurrentBrush();
                    if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                        x1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        x1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    x1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                qg.x1 x1Var2 = n0Var.l1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush2 = n0Var.W0.getCurrentBrush();
                    if (!(currentBrush2 instanceof pg.b) && !(currentBrush2 instanceof pg.d)) {
                        x1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        x1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    x1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public y5(zn znVar, zn znVar2, Runnable runnable) {
        this.a = 1;
        this.e = znVar;
        this.c = znVar2;
        this.d = runnable;
    }
}
