package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.sn;
import org.telegram.ui.ti;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class n5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n5(pw0 pw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = pw0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.e;
                f6Var.Y0 = f6Var.Z0;
                f6Var.Z0 = -1;
                f6Var.W0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == f6Var.b1) {
                    f6Var.b1 = null;
                    break;
                }
                break;
            case 1:
                sn snVar = (sn) this.e;
                snVar.a6 = true;
                ((org.telegram.ui.ActionBar.o2) snVar).fragmentBeginToShow = true;
                snVar.ha = null;
                AndroidUtilities.runOnUIThread(new ti(this, 0), 32L);
                super.onAnimationEnd(animator);
                snVar.j1.invalidate();
                snVar.j1.setSkipBackgroundDrawing(false);
                snVar.ea = false;
                sn snVar2 = (sn) this.c;
                snVar2.ga = 0.0f;
                snVar2.fragmentView.invalidate();
                snVar2.x0.invalidate();
                snVar2.fa = null;
                snVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                snVar.m1.setTranslationY(0.0f);
                snVar2.m1.setTranslationY(0.0f);
                snVar2.m1.getAvatarImageView().setTranslationY(0.0f);
                snVar.m1.getAvatarImageView().setScaleX(1.0f);
                snVar.m1.getAvatarImageView().setScaleY(1.0f);
                snVar.m1.getAvatarImageView().setAlpha(1.0f);
                snVar2.m1.getAvatarImageView().setScaleX(1.0f);
                snVar2.m1.getAvatarImageView().setScaleY(1.0f);
                snVar2.m1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = snVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.e;
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
                f6 f6Var = (f6) this.e;
                rg.x1 x1Var = f6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    qg.m currentBrush = f6Var.O0.getCurrentBrush();
                    if (!(currentBrush instanceof qg.b) && !(currentBrush instanceof qg.d)) {
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
                i10 = ((org.telegram.ui.ActionBar.o2) ((sn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.e;
                rg.x1 x1Var2 = m0Var.l1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    qg.m currentBrush2 = m0Var.W0.getCurrentBrush();
                    if (!(currentBrush2 instanceof qg.b) && !(currentBrush2 instanceof qg.d)) {
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

    public n5(sn snVar, sn snVar2, Runnable runnable) {
        this.a = 1;
        this.e = snVar;
        this.c = snVar2;
        this.d = runnable;
    }
}
