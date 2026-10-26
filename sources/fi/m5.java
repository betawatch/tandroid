package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.ui;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m5(ww0 ww0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = ww0Var;
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
                un unVar = (un) this.e;
                unVar.a6 = true;
                ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow = true;
                unVar.ha = null;
                AndroidUtilities.runOnUIThread(new ui(this, 0), 32L);
                super.onAnimationEnd(animator);
                unVar.j1.invalidate();
                unVar.j1.setSkipBackgroundDrawing(false);
                unVar.ea = false;
                un unVar2 = (un) this.c;
                unVar2.ga = 0.0f;
                unVar2.fragmentView.invalidate();
                unVar2.x0.invalidate();
                unVar2.fa = null;
                unVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                unVar.m1.setTranslationY(0.0f);
                unVar2.m1.setTranslationY(0.0f);
                unVar2.m1.getAvatarImageView().setTranslationY(0.0f);
                unVar.m1.getAvatarImageView().setScaleX(1.0f);
                unVar.m1.getAvatarImageView().setScaleY(1.0f);
                unVar.m1.getAvatarImageView().setAlpha(1.0f);
                unVar2.m1.getAvatarImageView().setScaleX(1.0f);
                unVar2.m1.getAvatarImageView().setScaleY(1.0f);
                unVar2.m1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = unVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                sg.n0 n0Var = (sg.n0) this.e;
                n0Var.V0 = n0Var.W0;
                n0Var.W0 = -1;
                n0Var.U0.invalidate();
                View view2 = (View) this.c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == n0Var.Y0) {
                    n0Var.Y0 = null;
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
                sg.y1 y1Var = e6Var.S0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    rg.m currentBrush = e6Var.D0.getCurrentBrush();
                    if (!(currentBrush instanceof rg.b) && !(currentBrush instanceof rg.d)) {
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
                i10 = ((org.telegram.ui.ActionBar.r2) ((un) this.e)).currentAccount;
                this.b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.b, null);
                break;
            default:
                sg.n0 n0Var = (sg.n0) this.e;
                sg.y1 y1Var2 = n0Var.a1;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    rg.m currentBrush2 = n0Var.L0.getCurrentBrush();
                    if (!(currentBrush2 instanceof rg.b) && !(currentBrush2 instanceof rg.d)) {
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

    public m5(un unVar, un unVar2, Runnable runnable) {
        this.a = 1;
        this.e = unVar;
        this.c = unVar2;
        this.d = runnable;
    }
}
