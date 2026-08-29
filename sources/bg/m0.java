package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.it0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(iv0 iv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.a = i11;
        this.e = iv0Var;
        this.b = viewGroup;
        this.c = viewGroup2;
        this.d = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.e;
                g1Var.c1 = g1Var.d1;
                g1Var.d1 = -1;
                g1Var.b1.invalidate();
                View view = (View) this.b;
                if (view != null && ((View) this.c) != null) {
                    view.setVisibility(8);
                }
                if (animator == g1Var.f1) {
                    g1Var.f1 = null;
                    break;
                }
                break;
            case 1:
                t5 t5Var = (t5) this.e;
                t5Var.U0 = t5Var.V0;
                t5Var.V0 = -1;
                t5Var.S0.invalidate();
                View view2 = (View) this.b;
                if (view2 != null && ((View) this.c) != null) {
                    view2.setVisibility(8);
                }
                if (animator == t5Var.X0) {
                    t5Var.X0 = null;
                    break;
                }
                break;
            default:
                tn tnVar = (tn) this.e;
                tnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow = true;
                tnVar.R9 = null;
                AndroidUtilities.runOnUIThread(new it0(this, 29), 32L);
                super.onAnimationEnd(animator);
                tnVar.T0.invalidate();
                tnVar.T0.setSkipBackgroundDrawing(false);
                tnVar.O9 = false;
                tn tnVar2 = (tn) this.b;
                tnVar2.Q9 = 0.0f;
                tnVar2.fragmentView.invalidate();
                tnVar2.t0.invalidate();
                tnVar2.P9 = null;
                tnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.c).run();
                tnVar.W0.setTranslationY(0.0f);
                tnVar2.W0.setTranslationY(0.0f);
                tnVar2.W0.getAvatarImageView().setTranslationY(0.0f);
                tnVar.W0.getAvatarImageView().setScaleX(1.0f);
                tnVar.W0.getAvatarImageView().setScaleY(1.0f);
                tnVar.W0.getAvatarImageView().setAlpha(1.0f);
                tnVar2.W0.getAvatarImageView().setScaleX(1.0f);
                tnVar2.W0.getAvatarImageView().setScaleY(1.0f);
                tnVar2.W0.getAvatarImageView().setAlpha(1.0f);
                vg vgVar = tnVar2.I0;
                if (vgVar != null) {
                    vgVar.setAlpha(1.0f);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        View view2;
        int i10;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.e;
                w2 w2Var = g1Var.h1;
                if (((View) this.b) != null && (view = (View) this.c) != null) {
                    view.setVisibility(0);
                }
                if (this.d != 2) {
                    ag.m currentBrush = g1Var.S0.getCurrentBrush();
                    if (!(currentBrush instanceof ag.b) && !(currentBrush instanceof ag.d)) {
                        w2Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        w2Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    w2Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                t5 t5Var = (t5) this.e;
                w2 w2Var2 = t5Var.Z0;
                if (((View) this.b) != null && (view2 = (View) this.c) != null) {
                    view2.setVisibility(0);
                }
                if (this.d != 2) {
                    ag.m currentBrush2 = t5Var.K0.getCurrentBrush();
                    if (!(currentBrush2 instanceof ag.b) && !(currentBrush2 instanceof ag.d)) {
                        w2Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        w2Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    w2Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((tn) this.e)).currentAccount;
                this.d = NotificationCenter.getInstance(i10).setAnimationInProgress(this.d, null);
                break;
        }
    }

    public m0(tn tnVar, tn tnVar2, Runnable runnable) {
        this.a = 2;
        this.e = tnVar;
        this.b = tnVar2;
        this.c = runnable;
    }
}
