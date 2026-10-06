package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.hu0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class x5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x5(nw0 nw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = nw0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.b1) {
                    q6Var.b1 = null;
                    break;
                }
                break;
            case 1:
                yn ynVar = (yn) this.e;
                ynVar.M5 = true;
                ((org.telegram.ui.ActionBar.n2) ynVar).fragmentBeginToShow = true;
                ynVar.T9 = null;
                AndroidUtilities.runOnUIThread(new hu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                ynVar.V0.invalidate();
                ynVar.V0.setSkipBackgroundDrawing(false);
                ynVar.Q9 = false;
                yn ynVar2 = (yn) this.c;
                ynVar2.S9 = 0.0f;
                ynVar2.fragmentView.invalidate();
                ynVar2.v0.invalidate();
                ynVar2.R9 = null;
                ynVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                ynVar.Y0.setTranslationY(0.0f);
                ynVar2.Y0.setTranslationY(0.0f);
                ynVar2.Y0.getAvatarImageView().setTranslationY(0.0f);
                ynVar.Y0.getAvatarImageView().setScaleX(1.0f);
                ynVar.Y0.getAvatarImageView().setScaleY(1.0f);
                ynVar.Y0.getAvatarImageView().setAlpha(1.0f);
                ynVar2.Y0.getAvatarImageView().setScaleX(1.0f);
                ynVar2.Y0.getAvatarImageView().setScaleY(1.0f);
                ynVar2.Y0.getAvatarImageView().setAlpha(1.0f);
                eh ehVar = ynVar2.K0;
                if (ehVar != null) {
                    ehVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                qg.m0 m0Var = (qg.m0) this.e;
                m0Var.g1 = m0Var.h1;
                m0Var.h1 = -1;
                m0Var.f1.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.j1) {
                    m0Var.j1 = null;
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
                q6 q6Var = (q6) this.e;
                qg.w1 w1Var = q6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush = q6Var.O0.getCurrentBrush();
                    if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                qg.m0 m0Var = (qg.m0) this.e;
                qg.w1 w1Var2 = m0Var.l1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush2 = m0Var.W0.getCurrentBrush();
                    if (!(currentBrush2 instanceof pg.b) && !(currentBrush2 instanceof pg.d)) {
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

    public x5(yn ynVar, yn ynVar2, Runnable runnable) {
        this.a = 1;
        this.e = ynVar;
        this.c = ynVar2;
        this.d = runnable;
    }
}
