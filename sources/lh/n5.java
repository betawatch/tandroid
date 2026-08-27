package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.og;
import org.telegram.ui.lt0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n5(av0 av0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = av0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.e;
                f6Var.U0 = f6Var.V0;
                f6Var.V0 = -1;
                f6Var.S0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == f6Var.X0) {
                    f6Var.X0 = null;
                    break;
                }
                break;
            case 1:
                rn rnVar = (rn) this.e;
                rnVar.K5 = true;
                ((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow = true;
                rnVar.R9 = null;
                AndroidUtilities.runOnUIThread(new lt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                rnVar.T0.invalidate();
                rnVar.T0.setSkipBackgroundDrawing(false);
                rnVar.O9 = false;
                rn rnVar2 = (rn) this.c;
                rnVar2.Q9 = 0.0f;
                rnVar2.fragmentView.invalidate();
                rnVar2.t0.invalidate();
                rnVar2.P9 = null;
                rnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                rnVar.W0.setTranslationY(0.0f);
                rnVar2.W0.setTranslationY(0.0f);
                rnVar2.W0.getAvatarImageView().setTranslationY(0.0f);
                rnVar.W0.getAvatarImageView().setScaleX(1.0f);
                rnVar.W0.getAvatarImageView().setScaleY(1.0f);
                rnVar.W0.getAvatarImageView().setAlpha(1.0f);
                rnVar2.W0.getAvatarImageView().setScaleX(1.0f);
                rnVar2.W0.getAvatarImageView().setScaleY(1.0f);
                rnVar2.W0.getAvatarImageView().setAlpha(1.0f);
                og ogVar = rnVar2.I0;
                if (ogVar != null) {
                    ogVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.e;
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
        int i10;
        View view2;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.e;
                zf.w1 w1Var = f6Var.Z0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    yf.m currentBrush = f6Var.K0.getCurrentBrush();
                    if (!(currentBrush instanceof yf.b) && !(currentBrush instanceof yf.d)) {
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((rn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.e;
                zf.w1 w1Var2 = l0Var.h1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    yf.m currentBrush2 = l0Var.S0.getCurrentBrush();
                    if (!(currentBrush2 instanceof yf.b) && !(currentBrush2 instanceof yf.d)) {
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

    public n5(rn rnVar, rn rnVar2, Runnable runnable) {
        this.a = 1;
        this.e = rnVar;
        this.c = rnVar2;
        this.d = runnable;
    }
}
