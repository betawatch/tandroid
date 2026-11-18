package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.aj;
import org.telegram.messenger.ks;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.bh;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class y4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y4(bu0 bu0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.a = i10;
        this.e = bu0Var;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                if (this.b != 0) {
                    ((View) this.c).setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.e;
                l5Var.I0 = l5Var.J0;
                l5Var.J0 = -1;
                l5Var.G0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == l5Var.L0) {
                    l5Var.L0 = null;
                    break;
                }
                break;
            case 1:
                bn bnVar = (bn) this.e;
                bnVar.g6 = true;
                ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow = true;
                bnVar.sa = null;
                org.telegram.messenger.g0.h3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                bnVar.m1.invalidate();
                bnVar.m1.setSkipBackgroundDrawing(false);
                bnVar.pa = false;
                bn bnVar2 = (bn) this.c;
                bnVar2.ra = 0.0f;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                bnVar2.qa = null;
                bnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                bnVar.p1.setTranslationY(0.0f);
                bnVar2.p1.setTranslationY(0.0f);
                bnVar2.p1.getAvatarImageView().setTranslationY(0.0f);
                bnVar.p1.getAvatarImageView().setScaleX(1.0f);
                bnVar.p1.getAvatarImageView().setScaleY(1.0f);
                bnVar.p1.getAvatarImageView().setAlpha(1.0f);
                bnVar2.p1.getAvatarImageView().setScaleX(1.0f);
                bnVar2.p1.getAvatarImageView().setScaleY(1.0f);
                bnVar2.p1.getAvatarImageView().setAlpha(1.0f);
                ah ahVar = bnVar2.b1;
                if (ahVar != null) {
                    ahVar.setAlpha(1.0f);
                    break;
                }
                break;
            case 2:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.e;
                v4.f1 f1Var = (v4.f1) this.d;
                kVar.X(f1Var.a);
                View view2 = f1Var.a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.ob) {
                        q1Var.ob = false;
                        q1Var.setVisibility(0);
                    }
                    aj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        zi ziVar = currentMessagesGroup.m;
                        ziVar.n = 1.0f;
                        ziVar.h = 0.0f;
                        ziVar.f = 0.0f;
                        ziVar.g = 0.0f;
                        ziVar.e = 0.0f;
                        ziVar.j = false;
                    }
                }
                if (kVar.z.remove(f1Var)) {
                    kVar.v(f1Var);
                    kVar.G();
                    break;
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.e;
                g0Var.Q0 = g0Var.R0;
                g0Var.R0 = -1;
                g0Var.P0.invalidate();
                View view3 = (View) this.c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == g0Var.T0) {
                    g0Var.T0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        int i7;
        View view2;
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.e;
                tg.m1 m1Var = l5Var.N0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush = l5Var.y0.getCurrentBrush();
                    if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                        m1Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        m1Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    m1Var.b(0.5f, 2.0f);
                    break;
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.h2) ((bn) this.e)).currentAccount;
                this.b = ks.f(i7).q(null, this.b, true);
                break;
            case 2:
                ((pi.k) this.e).getClass();
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.e;
                tg.m1 m1Var2 = g0Var.V0;
                if (((View) this.c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush2 = g0Var.G0.getCurrentBrush();
                    if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                        m1Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        m1Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    m1Var2.b(0.5f, 2.0f);
                    break;
                }
                break;
        }
    }

    public y4(pi.k kVar, v4.f1 f1Var, int i7, View view) {
        this.a = 2;
        this.e = kVar;
        this.d = f1Var;
        this.b = i7;
        this.c = view;
    }

    public y4(bn bnVar, bn bnVar2, Runnable runnable) {
        this.a = 1;
        this.e = bnVar;
        this.c = bnVar2;
        this.d = runnable;
    }
}
