package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.co;
import org.telegram.ui.lu0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class y5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y5(pv0 pv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = pv0Var;
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
                co coVar = (co) this.e;
                coVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow = true;
                coVar.V9 = null;
                AndroidUtilities.runOnUIThread(new lu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                coVar.X0.invalidate();
                coVar.X0.setSkipBackgroundDrawing(false);
                coVar.S9 = false;
                co coVar2 = (co) this.c;
                coVar2.U9 = 0.0f;
                coVar2.fragmentView.invalidate();
                coVar2.x0.invalidate();
                coVar2.T9 = null;
                coVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                coVar.a1.setTranslationY(0.0f);
                coVar2.a1.setTranslationY(0.0f);
                coVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                coVar.a1.getAvatarImageView().setScaleX(1.0f);
                coVar.a1.getAvatarImageView().setScaleY(1.0f);
                coVar.a1.getAvatarImageView().setAlpha(1.0f);
                coVar2.a1.getAvatarImageView().setScaleX(1.0f);
                coVar2.a1.getAvatarImageView().setScaleY(1.0f);
                coVar2.a1.getAvatarImageView().setAlpha(1.0f);
                dh dhVar = coVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.e;
                o0Var.g1 = o0Var.h1;
                o0Var.h1 = -1;
                o0Var.f1.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == o0Var.j1) {
                    o0Var.j1 = null;
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
                rg.y1 y1Var = q6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    qg.m currentBrush = q6Var.O0.getCurrentBrush();
                    if (!(currentBrush instanceof qg.b) && !(currentBrush instanceof qg.d)) {
                        y1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        y1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    y1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((co) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.e;
                rg.y1 y1Var2 = o0Var.l1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    qg.m currentBrush2 = o0Var.W0.getCurrentBrush();
                    if (!(currentBrush2 instanceof qg.b) && !(currentBrush2 instanceof qg.d)) {
                        y1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        y1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    y1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public y5(co coVar, co coVar2, Runnable runnable) {
        this.a = 1;
        this.e = coVar;
        this.c = coVar2;
        this.d = runnable;
    }
}
