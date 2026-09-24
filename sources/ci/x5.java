package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.eu0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class x5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x5(bw0 bw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
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
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                AndroidUtilities.runOnUIThread(new eu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                wnVar.X0.invalidate();
                wnVar.X0.setSkipBackgroundDrawing(false);
                wnVar.S9 = false;
                wn wnVar2 = (wn) this.c;
                wnVar2.U9 = 0.0f;
                wnVar2.fragmentView.invalidate();
                wnVar2.x0.invalidate();
                wnVar2.T9 = null;
                wnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wnVar.a1.setTranslationY(0.0f);
                wnVar2.a1.setTranslationY(0.0f);
                wnVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                wnVar.a1.getAvatarImageView().setScaleX(1.0f);
                wnVar.a1.getAvatarImageView().setScaleY(1.0f);
                wnVar.a1.getAvatarImageView().setAlpha(1.0f);
                wnVar2.a1.getAvatarImageView().setScaleX(1.0f);
                wnVar2.a1.getAvatarImageView().setScaleY(1.0f);
                wnVar2.a1.getAvatarImageView().setAlpha(1.0f);
                dh dhVar = wnVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(1.0f);
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
                q6 q6Var = (q6) this.e;
                qg.x1 x1Var = q6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    pg.m currentBrush = q6Var.O0.getCurrentBrush();
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
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
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

    public x5(wn wnVar, wn wnVar2, Runnable runnable) {
        this.a = 1;
        this.e = wnVar;
        this.c = wnVar2;
        this.d = runnable;
    }
}
