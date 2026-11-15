package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.an;
import org.telegram.ui.bh;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z4(tt0 tt0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.a = i10;
        this.e = tt0Var;
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
                m5 m5Var = (m5) this.e;
                m5Var.I0 = m5Var.J0;
                m5Var.J0 = -1;
                m5Var.G0.invalidate();
                View view = (View) this.c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == m5Var.L0) {
                    m5Var.L0 = null;
                    break;
                }
                break;
            case 1:
                an anVar = (an) this.e;
                anVar.f6 = true;
                ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow = true;
                anVar.ra = null;
                org.telegram.messenger.g0.i3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                anVar.m1.invalidate();
                anVar.m1.setSkipBackgroundDrawing(false);
                anVar.oa = false;
                an anVar2 = (an) this.c;
                anVar2.qa = 0.0f;
                anVar2.fragmentView.invalidate();
                anVar2.A0.invalidate();
                anVar2.pa = null;
                anVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                anVar.p1.setTranslationY(0.0f);
                anVar2.p1.setTranslationY(0.0f);
                anVar2.p1.getAvatarImageView().setTranslationY(0.0f);
                anVar.p1.getAvatarImageView().setScaleX(1.0f);
                anVar.p1.getAvatarImageView().setScaleY(1.0f);
                anVar.p1.getAvatarImageView().setAlpha(1.0f);
                anVar2.p1.getAvatarImageView().setScaleX(1.0f);
                anVar2.p1.getAvatarImageView().setScaleY(1.0f);
                anVar2.p1.getAvatarImageView().setAlpha(1.0f);
                rg rgVar = anVar2.b1;
                if (rgVar != null) {
                    rgVar.setAlpha(1.0f);
                    break;
                }
                break;
            case 2:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.e;
                v4.e1 e1Var = (v4.e1) this.d;
                kVar.X(e1Var.a);
                View view2 = e1Var.a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.ob) {
                        q1Var.ob = false;
                        q1Var.setVisibility(0);
                    }
                    bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        aj ajVar = currentMessagesGroup.m;
                        ajVar.n = 1.0f;
                        ajVar.h = 0.0f;
                        ajVar.f = 0.0f;
                        ajVar.g = 0.0f;
                        ajVar.e = 0.0f;
                        ajVar.j = false;
                    }
                }
                if (kVar.z.remove(e1Var)) {
                    kVar.v(e1Var);
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
                m5 m5Var = (m5) this.e;
                tg.m1 m1Var = m5Var.N0;
                if (((View) this.c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.b != 2) {
                    sg.h currentBrush = m5Var.y0.getCurrentBrush();
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
                i7 = ((org.telegram.ui.ActionBar.e2) ((an) this.e)).currentAccount;
                this.b = ns.f(i7).q(null, this.b, true);
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

    public z4(pi.k kVar, v4.e1 e1Var, int i7, View view) {
        this.a = 2;
        this.e = kVar;
        this.d = e1Var;
        this.b = i7;
        this.c = view;
    }

    public z4(an anVar, an anVar2, Runnable runnable) {
        this.a = 1;
        this.e = anVar;
        this.c = anVar2;
        this.d = runnable;
    }
}
