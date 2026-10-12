package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.fo;
import org.telegram.ui.gj;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w5(pw0 pw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
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
                o6 o6Var = (o6) this.e;
                o6Var.Y0 = o6Var.Z0;
                o6Var.Z0 = -1;
                o6Var.W0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == o6Var.b1) {
                    o6Var.b1 = null;
                    break;
                }
                break;
            case 1:
                fo foVar = (fo) this.e;
                foVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) foVar).fragmentBeginToShow = true;
                foVar.V9 = null;
                AndroidUtilities.runOnUIThread(new gj(this, 0), 32L);
                super.onAnimationEnd(animator);
                foVar.X0.invalidate();
                foVar.X0.setSkipBackgroundDrawing(false);
                foVar.S9 = false;
                fo foVar2 = (fo) this.c;
                foVar2.U9 = 0.0f;
                foVar2.fragmentView.invalidate();
                foVar2.x0.invalidate();
                foVar2.T9 = null;
                foVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                foVar.a1.setTranslationY(0.0f);
                foVar2.a1.setTranslationY(0.0f);
                foVar2.a1.getAvatarImageView().setTranslationY(0.0f);
                foVar.a1.getAvatarImageView().setScaleX(1.0f);
                foVar.a1.getAvatarImageView().setScaleY(1.0f);
                foVar.a1.getAvatarImageView().setAlpha(1.0f);
                foVar2.a1.getAvatarImageView().setScaleX(1.0f);
                foVar2.a1.getAvatarImageView().setScaleY(1.0f);
                foVar2.a1.getAvatarImageView().setAlpha(1.0f);
                dh dhVar = foVar2.M0;
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
                o6 o6Var = (o6) this.e;
                rg.y1 y1Var = o6Var.d1;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    qg.m currentBrush = o6Var.O0.getCurrentBrush();
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
                i10 = ((org.telegram.ui.ActionBar.m2) ((fo) this.e)).currentAccount;
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

    public w5(fo foVar, fo foVar2, Runnable runnable) {
        this.a = 1;
        this.e = foVar;
        this.c = foVar2;
        this.d = runnable;
    }
}
