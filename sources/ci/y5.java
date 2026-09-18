package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.bo;
import org.telegram.ui.ou0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class y5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y5(rv0 rv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
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
                bo boVar = (bo) this.e;
                boVar.O5 = true;
                ((org.telegram.ui.ActionBar.o2) boVar).fragmentBeginToShow = true;
                boVar.V9 = null;
                AndroidUtilities.runOnUIThread(new ou0(this, 29), 32L);
                super.onAnimationEnd(animator);
                boVar.X0.invalidate();
                boVar.X0.setSkipBackgroundDrawing(false);
                boVar.S9 = false;
                bo boVar2 = (bo) this.c;
                boVar2.U9 = 0.0f;
                boVar2.fragmentView.invalidate();
                boVar2.x0.invalidate();
                boVar2.T9 = null;
                boVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                boVar.a1.setTranslationY(0.0f);
                boVar2.a1.setTranslationY(0.0f);
                boVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                boVar.a1.getAvatarImageView().setScaleX(1.0f);
                boVar.a1.getAvatarImageView().setScaleY(1.0f);
                boVar.a1.getAvatarImageView().setAlpha(1.0f);
                boVar2.a1.getAvatarImageView().setScaleX(1.0f);
                boVar2.a1.getAvatarImageView().setScaleY(1.0f);
                boVar2.a1.getAvatarImageView().setAlpha(1.0f);
                bh bhVar = boVar2.M0;
                if (bhVar != null) {
                    bhVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.e;
                p0Var.g1 = p0Var.h1;
                p0Var.h1 = -1;
                p0Var.f1.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == p0Var.j1) {
                    p0Var.j1 = null;
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
                qg.z1 z1Var = r6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush = r6Var.O0.getCurrentBrush();
                    if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                        z1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        z1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    z1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((bo) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.e;
                qg.z1 z1Var2 = p0Var.l1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush2 = p0Var.W0.getCurrentBrush();
                    if (!(currentBrush2 instanceof pg.b) && !(currentBrush2 instanceof pg.d)) {
                        z1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        z1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    z1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public y5(bo boVar, bo boVar2, Runnable runnable) {
        this.a = 1;
        this.e = boVar;
        this.c = boVar2;
        this.d = runnable;
    }
}
