package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.eo;
import org.telegram.ui.mu0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x6(bw0 bw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
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
                r7 r7Var = (r7) this.e;
                r7Var.Y0 = r7Var.Z0;
                r7Var.Z0 = -1;
                r7Var.W0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == r7Var.b1) {
                    r7Var.b1 = null;
                    break;
                }
                break;
            case 1:
                eo eoVar = (eo) this.e;
                eoVar.O5 = true;
                ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow = true;
                eoVar.V9 = null;
                AndroidUtilities.runOnUIThread(new mu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                eoVar.X0.invalidate();
                eoVar.X0.setSkipBackgroundDrawing(false);
                eoVar.S9 = false;
                eo eoVar2 = (eo) this.c;
                eoVar2.U9 = 0.0f;
                eoVar2.fragmentView.invalidate();
                eoVar2.x0.invalidate();
                eoVar2.T9 = null;
                eoVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                eoVar.a1.setTranslationY(0.0f);
                eoVar2.a1.setTranslationY(0.0f);
                eoVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                eoVar.a1.getAvatarImageView().setScaleX(1.0f);
                eoVar.a1.getAvatarImageView().setScaleY(1.0f);
                eoVar.a1.getAvatarImageView().setAlpha(1.0f);
                eoVar2.a1.getAvatarImageView().setScaleX(1.0f);
                eoVar2.a1.getAvatarImageView().setScaleY(1.0f);
                eoVar2.a1.getAvatarImageView().setAlpha(1.0f);
                fh fhVar = eoVar2.M0;
                if (fhVar != null) {
                    fhVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                pg.m0 m0Var = (pg.m0) this.e;
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
                r7 r7Var = (r7) this.e;
                pg.w1 w1Var = r7Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    og.m currentBrush = r7Var.O0.getCurrentBrush();
                    if (!(currentBrush instanceof og.b) && !(currentBrush instanceof og.d)) {
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
                i10 = ((org.telegram.ui.ActionBar.p2) ((eo) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                pg.m0 m0Var = (pg.m0) this.e;
                pg.w1 w1Var2 = m0Var.l1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    og.m currentBrush2 = m0Var.W0.getCurrentBrush();
                    if (!(currentBrush2 instanceof og.b) && !(currentBrush2 instanceof og.d)) {
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

    public x6(eo eoVar, eo eoVar2, Runnable runnable) {
        this.a = 1;
        this.e = eoVar;
        this.c = eoVar2;
        this.d = runnable;
    }
}
