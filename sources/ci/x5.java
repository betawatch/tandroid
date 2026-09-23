package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.fu0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class x5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x5(qv0 qv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = qv0Var;
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
                xn xnVar = (xn) this.e;
                xnVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow = true;
                xnVar.V9 = null;
                AndroidUtilities.runOnUIThread(new fu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                xnVar.X0.invalidate();
                xnVar.X0.setSkipBackgroundDrawing(false);
                xnVar.S9 = false;
                xn xnVar2 = (xn) this.c;
                xnVar2.U9 = 0.0f;
                xnVar2.fragmentView.invalidate();
                xnVar2.x0.invalidate();
                xnVar2.T9 = null;
                xnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                xnVar.a1.setTranslationY(0.0f);
                xnVar2.a1.setTranslationY(0.0f);
                xnVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                xnVar.a1.getAvatarImageView().setScaleX(1.0f);
                xnVar.a1.getAvatarImageView().setScaleY(1.0f);
                xnVar.a1.getAvatarImageView().setAlpha(1.0f);
                xnVar2.a1.getAvatarImageView().setScaleX(1.0f);
                xnVar2.a1.getAvatarImageView().setScaleY(1.0f);
                xnVar2.a1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = xnVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
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
                q6 q6Var = (q6) this.e;
                qg.z1 z1Var = q6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush = q6Var.O0.getCurrentBrush();
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((xn) this.e)).currentAccount;
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

    public x5(xn xnVar, xn xnVar2, Runnable runnable) {
        this.a = 1;
        this.e = xnVar;
        this.c = xnVar2;
        this.d = runnable;
    }
}
