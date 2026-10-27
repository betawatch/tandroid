package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.wn;
import org.telegram.ui.xi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m5(xw0 xw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = xw0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.e;
                e6Var.N0 = e6Var.O0;
                e6Var.O0 = -1;
                e6Var.L0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == e6Var.Q0) {
                    e6Var.Q0 = null;
                    break;
                }
                break;
            case 1:
                wn wnVar = (wn) this.e;
                wnVar.e6 = true;
                ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow = true;
                wnVar.la = null;
                AndroidUtilities.runOnUIThread(new xi(this, 0), 32L);
                super.onAnimationEnd(animator);
                wnVar.j1.invalidate();
                wnVar.j1.setSkipBackgroundDrawing(false);
                wnVar.ia = false;
                wn wnVar2 = (wn) this.c;
                wnVar2.ka = 0.0f;
                wnVar2.fragmentView.invalidate();
                wnVar2.x0.invalidate();
                wnVar2.ja = null;
                wnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wnVar.m1.setTranslationY(0.0f);
                wnVar2.m1.setTranslationY(0.0f);
                wnVar2.m1.getAvatarImageView().setTranslationY(0.0f);
                wnVar.m1.getAvatarImageView().setScaleX(1.0f);
                wnVar.m1.getAvatarImageView().setScaleY(1.0f);
                wnVar.m1.getAvatarImageView().setAlpha(1.0f);
                wnVar2.m1.getAvatarImageView().setScaleX(1.0f);
                wnVar2.m1.getAvatarImageView().setScaleY(1.0f);
                wnVar2.m1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = wnVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.e;
                m0Var.V0 = m0Var.W0;
                m0Var.W0 = -1;
                m0Var.U0.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.Y0) {
                    m0Var.Y0 = null;
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
                e6 e6Var = (e6) this.e;
                sg.x1 x1Var = e6Var.S0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    rg.m currentBrush = e6Var.D0.getCurrentBrush();
                    if (!(currentBrush instanceof rg.b) && !(currentBrush instanceof rg.d)) {
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
                i10 = ((org.telegram.ui.ActionBar.r2) ((wn) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.e;
                sg.x1 x1Var2 = m0Var.a1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    rg.m currentBrush2 = m0Var.L0.getCurrentBrush();
                    if (!(currentBrush2 instanceof rg.b) && !(currentBrush2 instanceof rg.d)) {
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

    public m5(wn wnVar, wn wnVar2, Runnable runnable) {
        this.a = 1;
        this.e = wnVar;
        this.c = wnVar2;
        this.d = runnable;
    }
}
